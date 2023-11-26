// 조창래 수정

package com.ssafy.enjoytrip.user.service;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.user.dao.UserDao;
import com.ssafy.enjoytrip.user.dto.UserDto;

@Service	
public class UserServiceImpl implements UserService {
	
	UserDao dao ;

	public UserServiceImpl(UserDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int registerUser(UserDto userDto) {
		// salt 생성
		String SALT = UserDto.makeSALT();
		userDto.setSALT(SALT);
		
		// hashed_password
		try {
			String hashedPwd = UserDto.Hashing(userDto.getPassword().getBytes(), SALT);
			userDto.setPassword(hashedPwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return dao.registerUser(userDto);
	}

	@Override
	public int modifyUser(UserDto userDto) {
		
		String SALT = dao.getSALT(userDto.getUserId());
		
		System.out.println("SALT: " + SALT);
		
		String hashedPwd;
		hashedPwd = "";
		try {
			hashedPwd = UserDto.Hashing(userDto.getPassword().getBytes(), SALT);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userDto.setPassword(hashedPwd);
		userDto.setSALT(SALT);
		
		return dao.modifyUser(userDto);
	}

	@Override
	// TODO 유저의 북마크를 모두 삭제해야 한다
	public int deleteUser(String user_id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(user_id);
	}

	@Override
	public UserDto getUser(String user_id) {
		// TODO Auto-generated method stub
		return dao.getUser(user_id);
	}

	@Override
	public UserDto login(String user_id, String password) {
		UserDto userDto = dao.login(user_id);
		
		if (userDto == null) {
			System.out.println("로그인 시도할 때 아이디가 존재하지 않음");
			return null;
		}
		
		String SALT = userDto.getSALT();
		String hashedPwd = "";
		
		// FIXME 유저의 SALT가 없는 경우: 나중에 지워야 할 코드
		if (SALT == null) {
			System.out.println("DB에 SALT가 NULL");
			SALT = userDto.makeSALT();
			try {
				String hashedPwdDB = UserDto.Hashing(userDto.getPassword().getBytes(), SALT);
				userDto.setPassword(hashedPwdDB);
				userDto.setSALT(SALT);
				dao.modifyUser(userDto);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			hashedPwd = UserDto.Hashing(password.getBytes(), SALT);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		 if (!(hashedPwd.equals(userDto.getPassword()))) {
			System.out.println("로그인 시도할 때 비밀번호가 틀림");
			return null;
		} else {
			// 로그인 성
			return userDto;
		}
		

	}

	@Override
	public int deleteAllBookmarksByUser(String userId) {
		return dao.deleteAllBookmarksByUser(userId);
	}


}
