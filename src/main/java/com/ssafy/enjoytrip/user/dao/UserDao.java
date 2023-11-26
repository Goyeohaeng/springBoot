// 조창래 수정

package com.ssafy.enjoytrip.user.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.user.dto.UserDto;

@Mapper
public interface UserDao {

	// 회원가입 
	int registerUser(UserDto userDto);

	// 회원 정보 수정 
	int modifyUser(UserDto userDto);
	
	// 회원의 북마크를 모두 삭제
	int deleteAllBookmarksByUser(String userId); // 유저의 모든 북마크를 삭제	
	
	// 회원 탈퇴 
	int deleteUser(String user_id);
	
	// 회원 마이페이지 
	UserDto getUser(String user_id);
	
	// 로그인 
	UserDto login(String user_id);
	
	// 계정 수정 시, 로그인 된 유저의 SALT 가져오기
	String getSALT(String userId);
	

}
