

package com.ssafy.enjoytrip.bookmark.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.bookmark.dao.BookmarkDao;
import com.ssafy.enjoytrip.bookmark.dto.BookmarkDto;

@Service
public class BookmarkServiceImpl implements BookmarkService {
	
	BookmarkDao dao;
	

	public BookmarkServiceImpl(BookmarkDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<BookmarkDto> bookmarkList(String userId) {
		return dao.bookmarkList(userId);
	}

	@Override
	public int insertBookmark(BookmarkDto dto) {
		return dao.insertBookmark(dto);
	}

	@Override
	public int deleteBookmark(int bookmarkId) {
		return dao.deleteBookmark(bookmarkId);
	}

	@Override
	public int deleteBookmarkByLocId(int locId, String userId) {
		// TODO Auto-generated method stub
		return dao.deleteBookmarkByLocId(locId, userId);
	}


	
	

}
