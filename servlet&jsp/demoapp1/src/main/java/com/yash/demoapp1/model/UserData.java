package com.yash.demoapp1.model;

public class UserData {
	
	private String emailString;
	private String passString;
	private String userNameString;
	
	public UserData() {
		
	}

	public UserData(String emailString, String passString, String userNameString) {
		super();
		this.emailString = emailString;
		this.passString = passString;
		this.userNameString = userNameString;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	public String getPassString() {
		return passString;
	}

	public void setPassString(String passString) {
		this.passString = passString;
	}

	public String getUserNameString() {
		return userNameString;
	}

	public void setUserNameString(String userNameString) {
		this.userNameString = userNameString;
	}
	
	@Override
	public String toString() {
		return "User [emailString=" + emailString + ", passString=" + passString + ", userNameString=" + userNameString
				+ "]";
	}
	
}
