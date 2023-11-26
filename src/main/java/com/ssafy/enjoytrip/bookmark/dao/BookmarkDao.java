package com.ssafy.enjoytrip.bookmark.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.bookmark.dto.BookmarkDto;

@Mapper
public interface BookmarkDao {
	List<BookmarkDto> bookmarkList(String userId);
	int insertBookmark(BookmarkDto dto);
	int deleteBookmark(int bookmarkId);
	int deleteBookmarkByLocId(@Param("locId") int locId, @Param("userId") String userId); // locId를 이용해 북마크 삭제
}
