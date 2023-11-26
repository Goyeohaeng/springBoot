package com.ssafy.enjoytrip.AttractionInfo.dto;

public class AttractionInfoDto {

	
	
	private int contentId; 
	private int contentTypeId; 
	private String title;
	private String addr1;
	private String addr2;
	private String zipcode;
	private String tel;
	
	
	private String fristImage; 
	private int sidoCode; 
	private int gugunCode; 
	private double latitude;
	private double logitude;

	private String userId; 
	private String bookmarkId;
	public AttractionInfoDto(int contentId, int contentTypeId, String title, String addr1, String addr2, String zipcode,
			String tel, String fristImage, int sidoCode, int gugunCode, double latitude, double logitude, String userId,
			String bookmarkId) {
		super();
		this.contentId = contentId;
		this.contentTypeId = contentTypeId;
		this.title = title;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.zipcode = zipcode;
		this.tel = tel;
		this.fristImage = fristImage;
		this.sidoCode = sidoCode;
		this.gugunCode = gugunCode;
		this.latitude = latitude;
		this.logitude = logitude;
		this.userId = userId;
		this.bookmarkId = bookmarkId;
	}
	public AttractionInfoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public int getContentTypeId() {
		return contentTypeId;
	}
	public void setContentTypeId(int contentTypeId) {
		this.contentTypeId = contentTypeId;
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
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFristImage() {
		return fristImage;
	}
	public void setFristImage(String fristImage) {
		this.fristImage = fristImage;
	}
	public int getSidoCode() {
		return sidoCode;
	}
	public void setSidoCode(int sidoCode) {
		this.sidoCode = sidoCode;
	}
	public int getGugunCode() {
		return gugunCode;
	}
	public void setGugunCode(int gugunCode) {
		this.gugunCode = gugunCode;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLogitude() {
		return logitude;
	}
	public void setLogitude(double logitude) {
		this.logitude = logitude;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBookmarkId() {
		return bookmarkId;
	}
	public void setBookmarkId(String bookmarkId) {
		this.bookmarkId = bookmarkId;
	}
	@Override
	public String toString() {
		return "AttractionInfoDto [contentId=" + contentId + ", contentTypeId=" + contentTypeId + ", title=" + title
				+ ", addr1=" + addr1 + ", addr2=" + addr2 + ", zipcode=" + zipcode + ", tel=" + tel + ", fristImage="
				+ fristImage + ", sidoCode=" + sidoCode + ", gugunCode=" + gugunCode + ", latitude=" + latitude
				+ ", logitude=" + logitude + ", userId=" + userId + ", bookmarkId=" + bookmarkId + "]";
	} 
	
	
}
