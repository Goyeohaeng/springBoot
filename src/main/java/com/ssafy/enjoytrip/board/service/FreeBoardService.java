package com.ssafy.enjoytrip.board.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.board.dto.FreeBoardDto;

public interface FreeBoardService {
	FreeBoardDto getBoard(int articleNo);

	int boardInsert(FreeBoardDto boardDto);

	// 3 글 수정하기
	int boardUpdate(FreeBoardDto boardDto);

	// 4 글 삭제하기
	int boardDelete(int articleNo);

	// 5 내가 쓴 글 가져오기
	List<FreeBoardDto> myBoardList(@Param("userId") String myUserId, @Param("limit") int limit,
			@Param("offset") int offset);

	// 6 전체 글 가져오기
	List<FreeBoardDto> boardList(@Param("limit") int limit, @Param("offset") int offset);

	// 키워드 검색해서 가져오기 
	List<FreeBoardDto> searchboardList(@Param("keyword") String keyword, @Param("limit") int limit, @Param("offset") int offset);

	//--- 키워드
	// 5 내가 쓴 글 가져오기
	List<FreeBoardDto> myBoardListCount(@Param("userId") String myUserId, @Param("limit") int limit,
			@Param("offset") int offset);

	// 6 전체 글 가져오기
	List<FreeBoardDto> boardListCount(@Param("limit") int limit, @Param("offset") int offset);

	// 장소 검색해서 가져오기
	List<FreeBoardDto> searchboardListCount(@Param("keyword") String keyword, @Param("limit") int limit, @Param("offset") int offset);
}
