// 조창래 수정

package com.ssafy.enjoytrip.user.service;

import com.ssafy.enjoytrip.user.dto.UserDto;

public interface UserService {

	// 회원가입 
	int registerUser(UserDto userDto);

	// 회원 정보 수정 
	int modifyUser(UserDto userDto);

	// 회원 탈퇴 
	int deleteUser(String user_id);
	
	int deleteAllBookmarksByUser(String userId); // 유저의 모든 북마크를 삭제
	
	// 회원 마이페이지 
	UserDto getUser(String user_id);
	
	// 로그인 
	UserDto login(String user_id, String password);
	
}
