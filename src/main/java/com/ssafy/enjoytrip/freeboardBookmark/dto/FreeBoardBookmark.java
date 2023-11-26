package com.ssafy.enjoytrip.freeboardBookmark.dto;

public class FreeBoardBookmark {
	
	// freeboard_bookmarkId,article_no,user_id,create_at
	private Integer freeboardBookmarkId; 
	private int articleNo; 
	private String userId; 
	private String createAt;
	private String content;
	private String title;
	
	public Integer getFreeboardBookmarkId() {
		return freeboardBookmarkId;
	}
	public void setFreeboardBookmarkId(Integer freeboardBookmarkId) {
		this.freeboardBookmarkId = freeboardBookmarkId;
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
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public FreeBoardBookmark() {
		super();
	}
	public FreeBoardBookmark(Integer freeboardBookmarkId, int articleNo, String userId, String createAt, String content,
			String title) {
		super();
		this.freeboardBookmarkId = freeboardBookmarkId;
		this.articleNo = articleNo;
		this.userId = userId;
		this.createAt = createAt;
		this.content = content;
		this.title = title;
	}
	@Override
	public String toString() {
		return "FreeBoardBookmark [freeboardBookmarkId=" + freeboardBookmarkId + ", articleNo=" + articleNo
				+ ", userId=" + userId + ", createAt=" + createAt + ", content=" + content + ", title=" + title + "]";
	} 
	
	
}
