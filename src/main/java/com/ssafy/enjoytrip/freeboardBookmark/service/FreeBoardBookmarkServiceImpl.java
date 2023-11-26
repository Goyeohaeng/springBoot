package com.ssafy.enjoytrip.freeboardBookmark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.freeboardBookmark.dao.FreeBoardBookmarkDao;
import com.ssafy.enjoytrip.freeboardBookmark.dto.FreeBoardBookmark;

@Service
public class FreeBoardBookmarkServiceImpl implements FreeBoardBookmarkService{

	@Autowired
	FreeBoardBookmarkDao dao;
	
	@Override
	public List<FreeBoardBookmark> getList(String userId) {
		return dao.getList(userId);
	}

	@Override
	public FreeBoardBookmark isBookmarked(String userId, int articleNo) {
		return dao.isBookmarked(userId, articleNo);
	}

	@Override
	public int addFreeBookmark(FreeBoardBookmark freeBoardBookmark) {
		return dao.addFreeBookmark(freeBoardBookmark);
	}

	@Override
	public int deleteFreeBookmark(int freeboard_bookmarkId) {
		return dao.deleteFreeBookmark(freeboard_bookmarkId);
	}

}
