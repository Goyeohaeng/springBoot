package com.ssafy.enjoytrip.board.controller;

import java.util.HashMap;
import java.util.List;
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

import com.ssafy.enjoytrip.board.dto.ReviewBoardDto;
import com.ssafy.enjoytrip.board.service.ReviewBoardService;
import com.ssafy.enjoytrip.user.dto.UserDto;

@RestController
public class ReviewBoardController {

	ReviewBoardService boardService;

	public ReviewBoardController(ReviewBoardService boardService) {
		super();
		this.boardService = boardService;
	}

	// postmapping
	@PostMapping("/boards/review")
	public Map<String, String> boardInsert(HttpSession session, @RequestBody ReviewBoardDto boardDto) {
//		ReviewBoardDto dto = new ReviewBoardDto();
//		UserDto user = (UserDto) session.getAttribute("user");
		int ret = -1;
		Map<String, String> map = new HashMap<>();
//		if (user != null) {
//			String user_id = user.getUserId();
//			dto = boardDto;
//			dto.setUserId(user_id);
//			System.out.println(user_id);
//			ret = boardService.boardInsert(boardDto);
//		}else {
//			System.out.println("session 없");
//	
//		}
		ret = boardService.boardInsert(boardDto);
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}

		return map;
	}

	@GetMapping("/boards/review/{articleNo}")
	public ReviewBoardDto getBoard(@PathVariable int articleNo) {
		return boardService.getBoard(articleNo);
	}

	@PutMapping("/boards/review/{articleNo}")
	public Map<String, String> boardUpdate(@PathVariable int articleNo, @RequestBody ReviewBoardDto boardDto) {
		int ret = boardService.boardUpdate(boardDto);
		Map<String, String> map = new HashMap<>();
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}
		
		System.out.println("modifying review");
		return map;
	}

	@DeleteMapping("/boards/review/{articleNo}")
	public Map<String, String> boardDelete(@PathVariable int articleNo) {
		int ret = boardService.boardDelete(articleNo);
		Map<String, String> map = new HashMap<>();
		if (ret == 1) {
			map.put("result", "success");
		} else {
			map.put("result", "fail");
		}

		return map;
	}

	@GetMapping("/boards/review/myList")
	public List<ReviewBoardDto> myBoardList(@RequestParam(value = "limit") int limit,
			@RequestParam(value = "offset") int offset, HttpSession session) {
		UserDto user = (UserDto) session.getAttribute("user");
		String myUserId = user.getUserId();
		return boardService.myBoardList(myUserId, limit, offset);
	}

	@GetMapping("/boards/review/allList")
	public List<ReviewBoardDto> boardList(@RequestParam(value = "limit") int limit,
			@RequestParam(value = "offset") int offset) {
		return boardService.boardList(limit, offset);
	}

	@GetMapping("/boards/review/list/{contentId}")
	public List<ReviewBoardDto> boardSpecific(@PathVariable int contentId) {
		return boardService.boardSpecific(contentId);
	}
	
	@GetMapping("/boards/review/listAvg/{contentId}")
	public Map<String, String> boardAvg(@PathVariable int contentId) {
		Double avg = boardService.avgStar(contentId);
		Map<String, String> map = new HashMap<>();
		if ( avg != null && avg >= 0 ) {
			map.put("result", "success");
			map.put("avg", String.valueOf(avg));
		} else {
			map.put("result", "fail");
		}
		return map;
	}
	
	@GetMapping("/boards/review/topList")
	public List<ReviewBoardDto> getTopList() {
		return boardService.getTopList();
	}
}
