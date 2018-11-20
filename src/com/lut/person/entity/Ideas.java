package com.lut.person.entity;

/*********************************
 * @类名 Ideas.java
 * @作者 alex
 * @日期 2018年11月20日-下午12:56:13
 * @版本 v1.0
 * @描述 ideas实体类
 *********************************/
public class Ideas {
	protected String user_ID;
    protected String ideas;
	
    
    public Ideas() {
		
	}


	public Ideas(String user_ID, String ideas) {
	
		this.user_ID = user_ID;
		this.ideas = ideas;
	}


	public String getUser_ID() {
		return user_ID;
	}


	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}


	public String getIdeas() {
		return ideas;
	}


	public void setIdeas(String ideas) {
		this.ideas = ideas;
	}


	@Override
	public String toString() {
		return "Ideas [user_ID=" + user_ID + ", ideas=" + ideas + "]";
	}
    
    
}
