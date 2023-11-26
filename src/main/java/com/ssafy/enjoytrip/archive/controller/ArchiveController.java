package com.ssafy.enjoytrip.archive.controller;

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

import com.ssafy.enjoytrip.archive.dto.ArchiveDto;
import com.ssafy.enjoytrip.archive.service.ArchiveService;
import com.ssafy.enjoytrip.user.dto.UserDto;

@RestController
@RequestMapping("/archive")
public class ArchiveController {
	
	@Autowired
	ArchiveService service;

	@GetMapping("/lists")
	List<ArchiveDto> getList(HttpSession session){
		UserDto user = (UserDto) session.getAttribute("user");
		return service.getArchiveList(user.getUserId());
	}
	
	@PostMapping("")
	Map<String, String> insertArchive(@RequestBody ArchiveDto dto, HttpSession session){
		UserDto user = (UserDto) session.getAttribute("user");
		Map<String, String> map = new HashMap<>();
		int ret = -1; 
		if(user != null) {
			dto.setUserId(user.getUserId());
			ret = service.insertArchive(dto);
			if(ret == 1) {
				map.put("result", "success");
			}else {
				map.put("result", "fail");
			}
		}else {
			map.put("result", "fail");
		}
		
		return map; 
	}
	
	@DeleteMapping("/{archiveId}")
	Map<String, String> deleteArchive( @PathVariable("archiveId") int archiveId){
		Map<String, String> map = new HashMap<>();
		int ret = -1; 
		ret = service.deleteArchive(archiveId);
		if(ret == 1) {
			map.put("result", "success");
		}else {
			map.put("result", "fail");
		}
		return map; 
	}
}
