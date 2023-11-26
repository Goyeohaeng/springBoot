package com.ssafy.enjoytrip.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.board.dao.BoardDao;
import com.ssafy.enjoytrip.board.dto.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	BoardDao boardDao;

	public BoardServiceImpl(BoardDao boardDao) {
		super();
		this.boardDao = boardDao;
	}

	@Override
	public int registerArticle(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return boardDao.registerArticle(boardDto);
	}

	@Override
	public List<BoardDto> searchListAll(int limit, int offset) {
		return boardDao.searchListAll(100, 0);
	}

	@Override
	public List<BoardDto> searchListBySubject(String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyArticle(BoardDto boardDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteArticle(int no) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BoardDto> searchByLocId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDto> searchMyBoard(String id, int limit, int offset) {
		// TODO Auto-generated method stub
		return boardDao.searchMyBoard(id, limit, offset);
	}

	@Override
	public BoardDto getArticle(int articleNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int articleListTotalCnt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int articleListUserIdTotalCnt(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardDto> articleListSearchWord(int limit, int offset, String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
