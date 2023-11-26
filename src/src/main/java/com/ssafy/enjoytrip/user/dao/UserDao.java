package com.ssafy.enjoytrip.user.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.user.dto.UserDto;



@Mapper
public interface UserDao {

	boolean registerUser(UserDto userDto);

	boolean modifyUser(UserDto userDto);

	boolean deleteUser(String user_id);
	
	UserDto getUser(String user_id);
	
}
