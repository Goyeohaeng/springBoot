// 조창래 수정

package com.ssafy.enjoytrip.bookmark.dto;

public class BookmarkDto {

	private String title; 
	private String addr1; 
	private String firstImage; 
	private int bookmarkId; 
	private String userId; 
	private int locId; 
	private String createAt; 
	
	// TODO 조창래 수정
	
	
	
	private Integer reviewId; // 만약 북마크에 작성된 후기가 있다면, 그 후기의 article_no임
	
	
	
	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}


	private String reviewContent;
	private String reviewTitle;
	private int star;
	
	private String reviewVisitTime;
	
	
	public String getReviewVisitTime() {
		return reviewVisitTime;
	}


	public void setReviewVistTime(String reviewVisitTime) {
		this.reviewVisitTime = reviewVisitTime;
	}


	public String getReviewContent() {
		return reviewContent;
	}


	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}


	public String getReviewTitle() {
		return reviewTitle;
	}


	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}


	public int getStar() {
		return star;
	}


	public void setStar(int star) {
		this.star = star;
	}


	

	public Integer getReviewId() {
		return reviewId;
	}


	public BookmarkDto() {
		super();
	}


	public BookmarkDto(String title, String addr1, String firstImage, int bookmarkId, String userId, int locId,
			String createAt) {
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
