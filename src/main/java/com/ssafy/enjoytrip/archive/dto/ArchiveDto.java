package com.ssafy.enjoytrip.archive.dto;

public class ArchiveDto {
	
	private String userId; 
	private String url;
	private String title; 
	private String contents;
	private String datetime;
	private String thumbnail;
	private int archiveId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public int getArchiveId() {
		return archiveId;
	}
	public void setArchiveId(int archiveId) {
		this.archiveId = archiveId;
	}
	public ArchiveDto(String userId, String url, String title, String contents, String datetime, String thumbnail,
			int archiveId) {
		super();
		this.userId = userId;
		this.url = url;
		this.title = title;
		this.contents = contents;
		this.datetime = datetime;
		this.thumbnail = thumbnail;
		this.archiveId = archiveId;
	}
	public ArchiveDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ArchiveDto [userId=" + userId + ", url=" + url + ", title=" + title + ", contents=" + contents
				+ ", datetime=" + datetime + ", thumbnail=" + thumbnail + ", archiveId=" + archiveId + "]";
	}
	
	
	
}
