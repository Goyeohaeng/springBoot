package com.ssafy.enjoytrip.bookmark.dto;

public class BookmarkDto {

	private String title; 
	private String addr1; 
	private String firstImage; 
	private int bookmarkId; 
	private String userId; 
	private int locId; 
	private String createAt; 
	

	public BookmarkDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BookmarkDto(String title, String addr1, String firstImage, int bookmarkId, String userId, int locId,
			String createAt) {
		super();
		this.title = title;
		this.addr1 = addr1;
		this.firstImage = firstImage;
		this.bookmarkId = bookmarkId;
		this.userId = userId;
		this.locId = locId;
		this.createAt = createAt;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAddr1() {
		return addr1;
	}


	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}


	public String getFirstImage() {
		return firstImage;
	}


	public void setFirstImage(String firstImage) {
		this.firstImage = firstImage;
	}


	public int getBookmarkId() {
		return bookmarkId;
	}


	public void setBookmarkId(int bookmarkId) {
		this.bookmarkId = bookmarkId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public int getLocId() {
		return locId;
	}


	public void setLocId(int locId) {
		this.locId = locId;
	}


	public String getCreateAt() {
		return createAt;
	}


	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	
	
}
