package com.ssafy.enjoytrip.comment.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.comment.dao.CommentDao;
import com.ssafy.enjoytrip.comment.dto.CommentDto;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	CommentDao dao;

	@Override
	public int insert(CommentDto dto) {
		// TODO Auto-generated method stub
		return dao.insert(dto);
	}

	@Override
	public int update(CommentDto dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}

	@Override
	public int delete(int commentId) {
		// TODO Auto-generated method stub
		return dao.delete(commentId);
	}

	@Override
	public List<CommentDto> getCommentList(@Param("article_no") int article_no, @Param("limit") int limit,
			@Param("offset") int offset) {
		// TODO Auto-generated method stub
		return dao.getCommentList(article_no, limit, offset);
	}

}
