package com.ssafy.enjoytrip.comment.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.comment.dto.CommentDto;

public interface CommentService {

	// 댓글 작성, 수정 삭제
	int insert(CommentDto dto);
	
	int update(CommentDto dto); 
	
	int delete(int commentId); 
	
	// 게시글에 대한 댓글 가져오기 
	List<CommentDto> getCommentList(@Param("article_no") int article_no,@Param("limit") int limit, @Param("offset")int offset);
}
