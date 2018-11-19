package com.lut.person.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ObjectUtils.Null;

import com.lut.person.entity.Users;
import com.lut.person.service.UserService;

/*********************************
 * @类名 test.java
 * @作者 alex
 * @日期 2018年10月20日-上午8:25:58
 * @版本
 * @描述
 *********************************/
public class test {
	public static void main(String[] args) {
		Users user = null;
		UserService us = new UserService();
		 int result = us.EditStu("2", "women", "123456", 25);
		System.out.println(result);
	}

}
