package com.ssafy.enjoytrip.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.enjoytrip.board.dto.BoardDto;
import com.ssafy.enjoytrip.board.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {

	BoardService boardService;

	public BoardController(BoardService boardService) {
		super();
		this.boardService = boardService;
	}

	// page로 이동하는 것을 -> home controller나 다른 controller에 모아둘 수도 있음
	@GetMapping("")
	public String boardMain() {
		return "boardMain";
	}

	@GetMapping("/list")
	@ResponseBody
	List<BoardDto> getList() {
		System.out.println("getList 진입 : ");
		List<BoardDto> dto = boardService.searchListAll(100, 0);
		System.out.println(dto);
		return dto;
	}

	@GetMapping("/myList/{userId}")
	@ResponseBody
	List<BoardDto> getMyList(@PathVariable String userId) {
		List<BoardDto> dto = boardService.searchMyBoard(userId, 100, 0);
		System.out.println(dto);
		return dto;
	}

	@PostMapping("/addBoardJSON")
	@ResponseBody
	int addBoardJSON(@RequestBody BoardDto dto) {
		int result = boardService.registerArticle(dto);
		return result;
	}

}
