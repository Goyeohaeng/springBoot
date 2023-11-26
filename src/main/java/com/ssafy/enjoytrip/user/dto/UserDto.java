// 조창래 수정

package com.ssafy.enjoytrip.user.dto;

import java.security.MessageDigest;
import java.security.SecureRandom;

import org.springframework.web.multipart.MultipartFile;

public class UserDto {
	private static final int SALT_SIZE = 16;

	private String userId;
	private String email;
	private String name;
	private String password;
	private String SALT;
	private byte[] profileImage;
	
	
	public byte[] getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}


	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSALT() {
		return SALT;
	}

	public void setSALT(String sALT) {
		SALT = sALT;
	}

	public static int getSaltSize() {
		return SALT_SIZE;
	}

	public UserDto(String userId, String email, String name, String password, String sALT) {
		super();
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.password = password;
		SALT = sALT;
	}

	// SALT 값 생성
	public static String makeSALT() {
		SecureRandom rnd = new SecureRandom();
		byte[] temp = new byte[SALT_SIZE];
		rnd.nextBytes(temp);

		return Byte_to_String(temp);
	}

	// 비밀번호 해싱
	public static String Hashing(byte[] password, String Salt) throws Exception {

		MessageDigest md = MessageDigest.getInstance("SHA-256"); // SHA-256 해시함수를 사용

		// key-stretching
		for (int i = 0; i < 10000; i++) {
			String temp = Byte_to_String(password) + Salt; // 패스워드와 Salt 를 합쳐 새로운 문자열 생성
			md.update(temp.getBytes()); // temp 의 문자열을 해싱하여 md 에 저장해둔다
			password = md.digest(); // md 객체의 다이제스트를 얻어 password 를 갱신한다
		}

		return Byte_to_String(password);
	}

	// 바이트 값을 16진수로 변경해준다
	public static String Byte_to_String(byte[] temp) {
		StringBuilder sb = new StringBuilder();
		for (byte a : temp) {
			sb.append(String.format("%02x", a));
		}
		return sb.toString();
	}
}
