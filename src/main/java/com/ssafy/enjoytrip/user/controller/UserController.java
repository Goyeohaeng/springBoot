// 조창래 수정

package com.ssafy.enjoytrip.user.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.enjoytrip.user.dto.UserDto;
import com.ssafy.enjoytrip.user.service.UserService;

@RestController
public class UserController {

	UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}

	@PostMapping("/login")
	  public Map<String, Object> login(HttpSession session, @RequestBody UserDto userDto) {
	        System.out.println("login 접근");
	        
	        String userId = userDto.getUserId();
	        String password = userDto.getPassword();
	        
	        UserDto user = service.login(userId, password); 
	            
	        Map<String, Object> map = new HashMap<>();
	        
	        System.out.println(user);
	        
	        if (user != null) {
	            session.setAttribute("user", user);
	            map.put("user", user);
	            map.put("result", "success");
	            System.out.println(session.getAttribute("user"));
	        } else {
	        	map.put("result", "fail");
	        }        
	        
	        return map;
	       
	    }
	

	// 로그아웃
	@GetMapping("/logout")
	public Map<String, String> logout(HttpSession session) {
		System.out.println("로그아웃 접근");
		session.invalidate();
		Map<String, String> map = new HashMap<>();
		map.put("result", "success");

		return map;
	}

	// 회원가입
	@PostMapping("/users/accounts")
	public Map<String, String> register(@RequestBody UserDto dto) {
		int ret = service.registerUser(dto);
		Map<String, String> map = new HashMap<>();
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}

		return map;
	}

	// 회원 마이페이지
	@GetMapping("/users/accounts")
	public UserDto getUser(HttpSession session) {
		UserDto user = (UserDto) session.getAttribute("user");
		System.out.println("login 되어 있는 유저 " + user);
		String userId = user.getUserId();
		UserDto userInfo = service.getUser(userId);
		return userInfo;
	}

	// 회원 정보 수정
	@PutMapping("/users/accounts")
	public Map<String, String> modifyUser(UserDto dto, HttpSession session, @RequestParam(value="file", required= false) MultipartFile file) {
		System.out.println(dto.toString());
		
		byte[] profileImageBytes = null;
		
		// 업로드 된 사진이 있다면, 
		if (file != null) {
			try {
				profileImageBytes = file.getBytes();
			} catch (IOException e) {
				System.out.println("업로드 된 프로필 이미지를 byte[]로 바꾸는 과정에서 오류");
				e.printStackTrace();
			}
		}
		
		dto.setProfileImage(profileImageBytes);
		
		int ret = service.modifyUser(dto);
		Map<String, String> map = new HashMap<>();
		if (ret == 1) {
			session.setAttribute("user", dto);
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}

		return map;
	}
	

	
	// TODO
	// 회원 탈퇴
	
	@DeleteMapping("/users/accounts")
	public Map<String, String> deleteUser(HttpSession session) {
		UserDto user = (UserDto) session.getAttribute("user");
		String userId = user.getUserId();
		
		Map<String, String> map = new HashMap<>();
		
		// 유저의 북마크를 모두 삭제
		int deleteBookmarks = service.deleteAllBookmarksByUser(userId);
		
		if (deleteBookmarks < 0) {
			System.out.println("유저의 북마크를 모두 삭제하는 과정에서 에러 발생");
			map.put("result", "fail");
			return map;
		}
		
		
		int ret = service.deleteUser(userId);
		
		if (ret > 0) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}

		return map;
		
	}
}
