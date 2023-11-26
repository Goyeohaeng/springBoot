package com.ssafy.enjoytrip.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.enjoytrip.board.dto.BoardDto;
@Mapper
public interface BoardDao {
	int registerArticle(BoardDto boardDto);

	List<BoardDto> searchListAll(int limit, int offset);

	List<BoardDto> searchByLocId(int loc_id);

	List<BoardDto> searchMyBoard(String id, int limit, int offset);

	void modifyArticle(BoardDto boardDto);

	void deleteArticle(int no);

	BoardDto getArticle(int articleNo);

	int articleListTotalCnt();

	int articleListUserIdTotalCnt(String userId);

	List<BoardDto> articleListSearchWord(int limit, int offset, String searchWord);

}
