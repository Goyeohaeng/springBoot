package com.ssafy.enjoytrip.board.dto;

public class ReviewBoardDto {
	private int articleNo; 
	private String userId; 
	private String title;
	private String content;
	private String visitTime;
	private String registerTime; 
	private int star; 
	private int contentId; 
	private int bookmarkId;
	
	public int getBookmarkId() {
		return bookmarkId;
	}

	public void setBookmarkId(int bookmarkId) {
		this.bookmarkId = bookmarkId;
	}

	public ReviewBoardDto() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getVisitTime() {
		return visitTime;
	}

	public void setVisitTime(String visitTime) {
		this.visitTime = visitTime;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}


	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	@Override
	public String toString() {
		return "ReviewBoardDto [articleNo=" + articleNo + ", userId=" + userId + ", title=" + title + ", content="
				+ content + ", visitTime=" + visitTime + ", registerTime=" + registerTime + ", star=" + star
				+ ", contentId=" + contentId + "]";
	}

	public ReviewBoardDto(int articleNo, String userId, String title, String content, String visitTime,
			String registerTime, int star, int contentId) {
		super();
		this.articleNo = articleNo;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.visitTime = visitTime;
		this.registerTime = registerTime;
		this.star = star;
		this.contentId = contentId;
	}

	
}
