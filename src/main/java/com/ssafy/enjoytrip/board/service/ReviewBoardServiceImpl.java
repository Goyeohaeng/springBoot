package com.ssafy.enjoytrip.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.board.dao.ReviewBoardDao;
import com.ssafy.enjoytrip.board.dto.ReviewBoardDto;

@Service
public class ReviewBoardServiceImpl implements ReviewBoardService {

	ReviewBoardDao boardDao;

	public ReviewBoardServiceImpl(ReviewBoardDao boardDao) {
		super();
		this.boardDao = boardDao;
	}

	@Override
	public int boardUpdate(ReviewBoardDto boardDto) {
		return boardDao.boardUpdate(boardDto);
	}

	@Override
	public int boardDelete(int articleNo) {
		return boardDao.boardDelete(articleNo);
	}

	@Override
	public List<ReviewBoardDto> myBoardList(String myUserId, int limit, int offset) {
		// TODO Auto-generated method stub
		return boardDao.myBoardList(myUserId, limit, offset);
	}

	@Override
	public List<ReviewBoardDto> boardList(int limit, int offset) {
		System.out.println(limit + " " + offset);
		return boardDao.boardList(limit, offset);
	}

	@Override
	public int boardInsert(ReviewBoardDto boardDto) {
		return boardDao.boardInsert(boardDto);
	}

	

	@Override
	public ReviewBoardDto getBoard(int articleNo) {
		return boardDao.getBoard(articleNo);
	}

	@Override
	public List<ReviewBoardDto> boardSpecific(int contentId) {
		return boardDao.boardSpecific(contentId);
	}

	@Override
	public Double avgStar(int contentId) {
		// TODO Auto-generated method stub
		return boardDao.avgStar(contentId);
	}

	@Override
	public List<ReviewBoardDto> getTopList() {
		// TODO Auto-generated method stub
		return boardDao.getTopList();
	}

}
