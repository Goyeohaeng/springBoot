package com.ssafy.enjoytrip.board.dto;

import java.util.Arrays;

public class FreeBoardDto {
	
	private int articleNo;
	private String userId;
	private String title;
	private String content;
	private String registerTime;
	private int count; 
	private byte[] profileImage;

	
	public FreeBoardDto() {
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

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public byte[] getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}

	public FreeBoardDto(int articleNo, String userId, String title, String content, String registerTime, int count,
			byte[] profileImage) {
		super();
		this.articleNo = articleNo;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.registerTime = registerTime;
		this.count = count;
		this.profileImage = profileImage;
	}

	@Override
	public String toString() {
		return "FreeBoardDto [articleNo=" + articleNo + ", userId=" + userId + ", title=" + title + ", content="
				+ content + ", registerTime=" + registerTime + ", count=" + count + ", profileImage="
				+ Arrays.toString(profileImage) + "]";
	}

}
