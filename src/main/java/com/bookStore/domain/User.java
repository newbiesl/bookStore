package com.bookStore.domain;

public class User {
	
	private int id;
	
	private String userName;
	
	private String userPwd;
	
	private byte[] userHeads;
	
	private String userSex;
	
	private int userAge;
	
	private String userNickname;
	
	private String userBrithday;
	
	private String userAddress;
	
	private int userBalance;
	
	private String userIntro;
	
	private String userType;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(int userBalance) {
		this.userBalance = userBalance;
	}

	public byte[] getUserHeads() {
		return userHeads;
	}

	public void setUserHeads(byte[] userHeads) {
		this.userHeads = userHeads;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserBrithday() {
		return userBrithday;
	}

	public void setUserBrithday(String userBrithday) {
		this.userBrithday = userBrithday;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserIntro() {
		return userIntro;
	}

	public void setUserIntro(String userIntro) {
		this.userIntro = userIntro;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
