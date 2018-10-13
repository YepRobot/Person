package com.lut.person.entity;

public class Users {
	private int user_ID;
	private String user_Name;
	private String user_Password;
	private int user_Gender;
	private int user_Age;

	
	
	public Users() {
		super();
	}

	public Users(int user_ID, String user_Name, String user_Password, int user_Gender, int user_Age) {
		super();
		this.user_ID = user_ID;
		this.user_Name = user_Name;
		this.user_Password = user_Password;
		this.user_Gender = user_Gender;
		this.user_Age = user_Age;
	}

	public int getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(int user_ID) {
		this.user_ID = user_ID;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getUser_Password() {
		return user_Password;
	}

	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}

	public int getUser_Gender() {
		return user_Gender;
	}

	public void setUser_Gender(int user_Gender) {
		this.user_Gender = user_Gender;
	}

	public int getUser_Age() {
		return user_Age;
	}

	public void setUser_Age(int user_Age) {
		this.user_Age = user_Age;
	}

	@Override
	public String toString() {
		return "Users [user_ID=" + user_ID + ", user_Name=" + user_Name + ", user_Password=" + user_Password
				+ ", user_Gender=" + user_Gender + ", user_Age=" + user_Age + "]";
	}

	
}
