package com.ssafy.enjoytrip.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.board.dao.FreeBoardDao;
import com.ssafy.enjoytrip.board.dto.FreeBoardDto;

@Service
public class FreeBoardServiceImpl implements FreeBoardService {

	FreeBoardDao boardDao;
	
	@Override
	public int boardInsert(FreeBoardDto boardDto) {
		return boardDao.boardInsert(boardDto);
	}

	public FreeBoardServiceImpl(FreeBoardDao boardDao) {
		super();
		this.boardDao = boardDao;
	}

	@Override
	public int boardUpdate(FreeBoardDto boardDto) {
		return boardDao.boardUpdate(boardDto);
	}

	@Override
	public int boardDelete(int articleNo) {
		return boardDao.boardDelete(articleNo);
	}

	@Override
	public List<FreeBoardDto> myBoardList(String myUserId, int limit, int offset) {
		// TODO Auto-generated method stub
		return boardDao.myBoardListRecent(myUserId, limit, offset);
	}

	@Override
	public List<FreeBoardDto> boardList(int limit, int offset) {
		// TODO Auto-generated method stub
		System.out.println(limit + " " + offset);
		return boardDao.boardListRecent(limit, offset);
	}

	

	@Override
	public FreeBoardDto getBoard(int articleNo) {
		// TODO Auto-generated method stub
		return boardDao.getBoard(articleNo);
	}

	@Override
	public List<FreeBoardDto> searchboardList(String keyword, int limit, int offset) {
		// TODO Auto-generated method stub
		return boardDao.searchboardListRecent(keyword, limit, offset);
	}

	@Override
	public List<FreeBoardDto> myBoardListCount(String myUserId, int limit, int offset) {
		// TODO Auto-generated method stub
		return boardDao.myBoardListCount(myUserId, limit, offset);
	}

	@Override
	public List<FreeBoardDto> boardListCount(int limit, int offset) {
		// TODO Auto-generated method stub
		return boardDao.boardListCount(limit, offset);
	}

	@Override
	public List<FreeBoardDto> searchboardListCount(String keyword, int limit, int offset) {
		// TODO Auto-generated method stub
		return boardDao.searchboardListCount(keyword, limit, offset);
	}

}
