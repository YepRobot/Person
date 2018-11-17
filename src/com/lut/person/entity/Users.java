package com.lut.person.entity;

public class Users {
	protected String user_ID;
	protected String user_Name;
	protected String user_Password;
	protected int user_Gender;
	protected int user_Age;
	protected int user_Power;
	protected int user_Status;

	
	
	public Users() {
		
	}

	

	public Users(String user_ID, String user_Name, String user_Password, int user_Gender, int user_Age, int user_Power,
			int user_Status) {
		super();
		this.user_ID = user_ID;
		this.user_Name = user_Name;
		this.user_Password = user_Password;
		this.user_Gender = user_Gender;
		this.user_Age = user_Age;
		this.user_Power = user_Power;
		this.user_Status = user_Status;
	}

	public Users(String user_ID, String user_Name, String user_Password, int user_Gender, int user_Age, int user_Power
			) {
		super();
		this.user_ID = user_ID;
		this.user_Name = user_Name;
		this.user_Password = user_Password;
		this.user_Gender = user_Gender;
		this.user_Age = user_Age;
		this.user_Power = user_Power;
		
	}



	public String getUser_ID() {
		return user_ID;
	}

	public void setUser_ID(String user_ID) {
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
	
	

	public int getUser_Power() {
		return user_Power;
	}



	public void setUser_Power(int user_Power) {
		this.user_Power = user_Power;
	}



	public int getUser_Status() {
		return user_Status;
	}



	public void setUser_Status(int user_Status) {
		this.user_Status = user_Status;
	}



	@Override
	public String toString() {
		return "Users [user_ID=" + user_ID + ", user_Name=" + user_Name + ", user_Password=" + user_Password
				+ ", user_Gender=" + user_Gender + ", user_Age=" + user_Age + ", user_Power=" + user_Power
				+ ", user_Status=" + user_Status + "]";
	}



	
	
}
