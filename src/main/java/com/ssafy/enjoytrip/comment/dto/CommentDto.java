package com.ssafy.enjoytrip.comment.dto;

import java.util.Arrays;

public class CommentDto {

	int commentId; 
	int articleNo;
	String userId; 
	String content; 
	String createAt;
	private byte[] profileImage;
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	
	public byte[] getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}
	@Override
	public String toString() {
		return "CommentDto [commentId=" + commentId + ", articleNo=" + articleNo + ", userId=" + userId + ", content="
				+ content + ", createAt=" + createAt + ", profileImage=" + Arrays.toString(profileImage) + "]";
	}
	public CommentDto(int commentId, int articleNo, String userId, String content, String createAt,
			byte[] profileImage) {
		super();
		this.commentId = commentId;
		this.articleNo = articleNo;
		this.userId = userId;
		this.content = content;
		this.createAt = createAt;
		this.profileImage = profileImage;
	}
	public CommentDto() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
}
