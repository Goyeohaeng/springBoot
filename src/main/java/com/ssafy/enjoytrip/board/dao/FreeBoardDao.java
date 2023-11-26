package com.ssafy.enjoytrip.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.board.dto.FreeBoardDto;

@Mapper
public interface FreeBoardDao {
	
	FreeBoardDto getBoard(int articleNo);

	int boardInsert(FreeBoardDto boardDto);

	// 3 글 수정하기
	int boardUpdate(FreeBoardDto boardDto);

	// 4 글 삭제하기
	int boardDelete(int articleNo);

	// 5 내가 쓴 글 가져오기
	List<FreeBoardDto> myBoardListRecent(@Param("userId") String myUserId, @Param("limit") int limit,
			@Param("offset") int offset);

	// 6 전체 글 가져오기
	List<FreeBoardDto> boardListRecent(@Param("limit") int limit, @Param("offset") int offset);

	// 장소 검색해서 가져오기
	List<FreeBoardDto> searchboardListRecent(@Param("keyword") String keyword, @Param("limit") int limit, @Param("offset") int offset);
	
	// ------- count순
	
	// 5 내가 쓴 글 가져오기
	List<FreeBoardDto> myBoardListCount(@Param("userId") String myUserId, @Param("limit") int limit,
			@Param("offset") int offset);

	// 6 전체 글 가져오기
	List<FreeBoardDto> boardListCount(@Param("limit") int limit, @Param("offset") int offset);

	// 장소 검색해서 가져오기
	List<FreeBoardDto> searchboardListCount(@Param("keyword") String keyword, @Param("limit") int limit, @Param("offset") int offset);

}
