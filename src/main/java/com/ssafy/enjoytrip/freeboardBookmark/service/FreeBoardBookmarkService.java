package com.ssafy.enjoytrip.freeboardBookmark.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.freeboardBookmark.dto.FreeBoardBookmark;

public interface FreeBoardBookmarkService {
	// 가져오기 
	List<FreeBoardBookmark> getList(String userId);
	// 여부 가져오기 
	FreeBoardBookmark isBookmarked (@Param("userId") String userId, @Param("articleNo") int articleNo);
	// 추가하기 
	int addFreeBookmark(FreeBoardBookmark freeBoardBookmark);
	// 삭제하기 
	int deleteFreeBookmark(int freeboard_bookmarkId);
}
