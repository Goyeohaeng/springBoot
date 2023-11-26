package com.ssafy.enjoytrip.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.board.dto.ReviewBoardDto;

public interface ReviewBoardService {
	ReviewBoardDto getBoard(int articleNo);

	// 2 글 작성하기
//		int boardInsert(@Param("locNo") int locNo, @Param("userId") String userId, @Param("content") String content, @Param("visitTime") String visitTime, String title);
	int boardInsert(ReviewBoardDto boardDto);

	// 3 글 수정하기
	int boardUpdate(ReviewBoardDto boardDto);

	// 4 글 삭제하기
	int boardDelete(int articleNo);

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
