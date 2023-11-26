package com.ssafy.enjoytrip.AttractionDescription.dto;

public class AttractionDescriptionDto {
	
	
	int contentId;
	String title; 
	String firstImage;
	String overview;
	double latitude;
	double longitude;
	
	
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstImage() {
		return firstImage;
	}
	public void setFirstImage(String firstImage) {
		this.firstImage = firstImage;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "AttractionDescriptionDto [contentId=" + contentId + ", title=" + title + ", firstImage=" + firstImage
				+ ", overview=" + overview + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	public AttractionDescriptionDto(int contentId, String title, String firstImage, String overview, double latitude,
			double longitude) {
		super();
		this.contentId = contentId;
		this.title = title;
		this.firstImage = firstImage;
		this.overview = overview;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public AttractionDescriptionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
