

package com.ssafy.enjoytrip.bookmark.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.bookmark.dto.BookmarkDto;
import com.ssafy.enjoytrip.bookmark.service.BookmarkService;
import com.ssafy.enjoytrip.user.dto.UserDto;

@RestController
public class BookmarkController {
	
	BookmarkService service;
	
	public BookmarkController(BookmarkService service) {
		super();
		this.service = service;
	}

	@GetMapping("/bookmarks")
	List<BookmarkDto> bookmarkList(HttpSession session){
		System.out.println("bookmarkList");
		List<BookmarkDto> list = new ArrayList<>();
		UserDto user = (UserDto) session.getAttribute("user");
		
		System.out.println(user.getUserId());
		list = service.bookmarkList(user.getUserId());
		System.out.println(list);
		return list;
	}
	
	@PostMapping("/bookmarks")
	Map<String, String> insertBookmark (HttpSession session, @RequestBody BookmarkDto dto){
		UserDto user = (UserDto) session.getAttribute("user");
		dto.setUserId(user.getUserId());
		int ret = service.insertBookmark(dto);
		Map<String, String> map = new HashMap<>();
		if(ret == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		
		return map; 
	}
	
	@DeleteMapping("/bookmarks/{bookmarkId}")
	Map<String, String> deleteBookmark(@PathVariable int bookmarkId){
		int ret = service.deleteBookmark(bookmarkId);
		System.out.println("delete ret: " + ret);
		Map<String, String> map = new HashMap<>();
		if(ret == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		
		System.out.println(map.toString());
		
		return map; 
	}
	
	@DeleteMapping("/bookmarks/{locId}/{userId}")
	Map<String, String> deleteBookmarkByLocId(@PathVariable int locId, @PathVariable String userId, HttpSession session) {
		UserDto user = (UserDto) session.getAttribute("user");
		int ret = service.deleteBookmarkByLocId(locId, user.getUserId());
		Map<String, String> map = new HashMap<>();
		if(ret == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		return map;
	}
	

}
