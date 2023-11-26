package com.ssafy.enjoytrip.comment.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.enjoytrip.comment.dto.CommentDto;
import com.ssafy.enjoytrip.comment.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService service; 
	
	// 가져오기 
	@GetMapping("/{articleNo}")
	public List<CommentDto> getCommentList(@PathVariable int articleNo, @RequestParam(value = "limit") int limit,
			@RequestParam(value = "offset") int offset) {
		return service.getCommentList(articleNo, limit, offset); 
	}
	
	
	// 추가 
	@PostMapping("/{articleNo}")
	public Map<String, String> insert(@RequestBody CommentDto dto) {
		int ret = service.insert(dto);
		Map<String, String> map = new HashMap<>();
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}

		return map; 
	}
	
	// 수정 
	@PutMapping("/{commentId}")
	public  Map<String, String> update(@PathVariable int commentId, @RequestBody CommentDto dto) {
		int ret = service.update(dto);
		Map<String, String> map = new HashMap<>();
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}

		return map;
	}
	
	// 삭제 
	@DeleteMapping("/{commentId}")
	public  Map<String, String> delete (@PathVariable int commentId) {
		int ret = service.delete(commentId);
		Map<String, String> map = new HashMap<>();
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}

		return map;
	}
}
