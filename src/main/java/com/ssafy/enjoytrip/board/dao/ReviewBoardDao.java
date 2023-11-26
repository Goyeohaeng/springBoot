package com.ssafy.enjoytrip.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.board.dto.ReviewBoardDto;

@Mapper
public interface ReviewBoardDao {
	int boardInsert(ReviewBoardDto boardDto);

	int boardUpdate(ReviewBoardDto boardDto);

	int boardDelete(int articleNo);

	// 글 한개 가져오기 
	ReviewBoardDto getBoard(int articleNo);
	
	// 5 내가 쓴 글 가져오기
	List<ReviewBoardDto> myBoardList(@Param("myUserId") String myUserId, @Param("limit") int limit,
			@Param("offset") int offset);

	// 6 전체 글 가져오기
	List<ReviewBoardDto> boardList(@Param("limit") int limit, @Param("offset") int offset);

	// 장소 검색해서 가져오기
	List<ReviewBoardDto> boardSpecific(int contentId);

	Double avgStar(int contentId);
	
	List<ReviewBoardDto> getTopList();

}
