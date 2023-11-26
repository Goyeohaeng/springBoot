package com.ssafy.enjoytrip.freeboardBookmark.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.freeboardBookmark.dto.FreeBoardBookmark;
import com.ssafy.enjoytrip.freeboardBookmark.service.FreeBoardBookmarkService;
import com.ssafy.enjoytrip.user.dto.UserDto;

@RestController
@RequestMapping("/freeBookmark")
public class FreeBoardBookmarkController {

	@Autowired
	FreeBoardBookmarkService service;
	
	@GetMapping("/lists")
	List<FreeBoardBookmark> getList(HttpSession session){
		UserDto user = (UserDto) session.getAttribute("user");
		return service.getList(user.getUserId());
	}
	
	@GetMapping("/{articleNo}")
	Map<String, String> getIsBookmarked(@PathVariable("articleNo") int articleNo, HttpSession session){
		System.out.println("가져오기 -------------- ");
		Map<String, String> map = new HashMap<>();
		UserDto user = (UserDto) session.getAttribute("user");
		if(user == null) {
			map.put("result", "fail");
			System.out.println("userIsNull");
			return map ;
		}else{
			map.put("result", "success");
			FreeBoardBookmark result = service.isBookmarked(user.getUserId(), articleNo);
			if(result == null) {
				map.put("freeBookmarkId", "empty" );
			}else {
				map.put("freeBookmarkId", String.valueOf(result.getFreeboardBookmarkId()));
			}
			return map;
		}
	}
	
	@PostMapping("")
	Map<String, String> addFreeBookmark(@RequestBody FreeBoardBookmark bookmark){
		Map<String, String> map = new HashMap<>();
		int ret = service.addFreeBookmark(bookmark);
		if(ret == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");	
		}
		return map; 
	}
	
	@DeleteMapping("/{freeboardBookmarkId}")
	Map<String, String> deleteFreeBookmark(@PathVariable("freeboardBookmarkId") int freeboardBookmarkId){
		Map<String, String> map = new HashMap<>();
		int ret = service.deleteFreeBookmark(freeboardBookmarkId);
		if(ret == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");	
		}
		return map; 
	}
}
