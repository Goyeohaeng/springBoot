package com.ssafy.enjoytrip.comment.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ssafy.enjoytrip.comment.dto.CommentDto;

@Mapper
public interface CommentDao {

	// 댓글 작성, 수정 삭제
	int insert(CommentDto dto);
	
	int update(CommentDto dto); 
	
	int delete(int commentId); 
	
	// 게시글에 대한 댓글 가져오기 
	List<CommentDto> getCommentList(@Param("articleNo") int articleNo,@Param("limit") int limit, @Param("offset")int offset);
}
