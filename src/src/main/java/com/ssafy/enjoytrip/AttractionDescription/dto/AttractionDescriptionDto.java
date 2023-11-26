package com.ssafy.enjoytrip.AttractionDescription.dto;

public class AttractionDescriptionDto {
	
	
	int contentId;
	String homepage; 
	String overview;
	String telname;
	
	public AttractionDescriptionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getContentId() {
		return contentId;
	}

	public void setContentId(int contentId) {
		this.contentId = contentId;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getTelname() {
		return telname;
	}

	public void setTelname(String telname) {
		this.telname = telname;
	}

	public AttractionDescriptionDto(int contentId, String homepage, String overview, String telname) {
		super();
		this.contentId = contentId;
		this.homepage = homepage;
		this.overview = overview;
		this.telname = telname;
	}

	@Override
	public String toString() {
		return "AttractionDescriptionDto [contentId=" + contentId + ", homepage=" + homepage + ", overview=" + overview
				+ ", telname=" + telname + "]";
	}
	
	
	
}
