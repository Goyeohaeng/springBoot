package com.ssafy.enjoytrip.board.dto;

public class BoardDto {
	
	
	private int articleNo;
	private int locNo; 
	private String title;
	private String userId;
	private String content;
	private String visitTime;
	private String registerTime;
	
	

	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getArticleNo() {
		return articleNo;
	}



	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}



	public int getLocNo() {
		return locNo;
	}



	public void setLocNo(int locNo) {
		this.locNo = locNo;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
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



	public BoardDto(int articleNo, int locNo, String title, String userId, String content, String visitTime,
			String registerTime) {
		super();
		this.articleNo = articleNo;
		this.locNo = locNo;
		this.title = title;
		this.userId = userId;
		this.content = content;
		this.visitTime = visitTime;
		this.registerTime = registerTime;
	}



	@Override
	public String toString() {
		return "BoardDto [articleNo=" + articleNo + ", locNo=" + locNo + ", title=" + title + ", userId=" + userId
				+ ", content=" + content + ", visitTime=" + visitTime + ", registerTime=" + registerTime + "]";
	}


}
