package com.ssafy.enjoytrip.board.controller;

import java.util.ArrayList;
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

import com.ssafy.enjoytrip.board.dto.FreeBoardDto;
import com.ssafy.enjoytrip.board.service.FreeBoardService;
import com.ssafy.enjoytrip.user.dto.UserDto;

@RestController
public class FreeBoardController {

	FreeBoardService boardService;

	public FreeBoardController(FreeBoardService boardService) {
		super();
		this.boardService = boardService;
	}

	@PostMapping("/boards/free") // 스크린 샷
	public Map<String, String> boardInsert(@RequestBody FreeBoardDto boardDto) {
		System.out.println("free board 요청");
		int ret = -1;
		Map<String, String> map = new HashMap<>();

		if (boardDto.getUserId() != null) {
			ret = boardService.boardInsert(boardDto);
			System.out.println();
		}else {
			System.out.println("session 존재X");
		}
		
		if (ret == 1) {
			map.put("result", "success");
			map.put("articleNo", Integer.toString(boardDto.getArticleNo()));
		} else {
			map.put("result", "fail");
		}

		return map;
	}

	@GetMapping("/boards/free/{articleNo}")
	public FreeBoardDto getBoard(@PathVariable int articleNo) {
		return boardService.getBoard(articleNo);
	}

	@PutMapping("/boards/free/{articleNo}") // 스크린 샷
	public Map<String, String> boardUpdate(@PathVariable int articleNo, @RequestBody FreeBoardDto boardDto) {
		int ret = boardService.boardUpdate(boardDto);
		Map<String, String> map = new HashMap<>();
		if (ret == 1) {
			map.put("result", "success");
			map.put("articleNo", Integer.toString(boardDto.getArticleNo()));
		} else {
			map.put("result", "fail");
		}

		return map;
	}

	@DeleteMapping("/boards/free/{articleNo}") // 스크린 샷
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

	@GetMapping("/boards/free/myList") // 스크린 샷
	public List<FreeBoardDto> myBoardList(@RequestParam(value = "limit") int limit,
			@RequestParam(value = "offset") int offset,@RequestParam(value = "userId") String userId) {
		List<FreeBoardDto> list = new ArrayList<>();
		List<FreeBoardDto> result = boardService.myBoardList(userId, limit, offset);
		if(result!=null) {
			list = result;
		}
		return list;
	}

	@GetMapping("/boards/free/allList") // 스크린 샷
	public List<FreeBoardDto> boardList(@RequestParam(value = "limit") int limit,
			@RequestParam(value = "offset") int offset) {
		return boardService.boardList(limit, offset);
	}

	@GetMapping("/boards/free/searchList") // 스크린 샷
	public List<FreeBoardDto> boardListLocation(@RequestParam(value = "keyword") String keyword,
			@RequestParam(value = "limit") int limit,
			@RequestParam(value = "offset") int offset){
		System.out.println("searchList");
		return boardService.searchboardList(keyword, limit, offset);
	}
	
	@GetMapping("/boards/free/myList/count") // 스크린 샷
	public List<FreeBoardDto> myBoardListCount(@RequestParam(value = "limit") int limit,
			@RequestParam(value = "offset") int offset,@RequestParam(value = "userId") String userId) {
		List<FreeBoardDto> list = new ArrayList<>();
		List<FreeBoardDto> result = boardService.myBoardListCount(userId, limit, offset);
		if(result!=null) {
			list = result;
		}
		return list;
	}

	@GetMapping("/boards/free/allList/count") // 스크린 샷
	public List<FreeBoardDto> boardListCount(@RequestParam(value = "limit") int limit,
			@RequestParam(value = "offset") int offset) {
		return boardService.boardListCount(limit, offset);
	}

	@GetMapping("/boards/free/searchList/count") // 스크린 샷
	public List<FreeBoardDto> boardListLocationCount(@RequestParam(value = "keyword") String keyword,
			@RequestParam(value = "limit") int limit,
			@RequestParam(value = "offset") int offset){
		System.out.println("searchList");
		return boardService.searchboardListCount(keyword, limit, offset);
	}

}
