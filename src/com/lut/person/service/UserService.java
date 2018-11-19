package com.lut.person.service;

import java.util.ArrayList;
import java.util.List;

import com.lut.person.dao.UserDao;
import com.lut.person.entity.Users;

/*********************************
 * @类名 UserService.java
 * @作者 alex
 * @日期 2018年10月11日-下午7:35:17
 * @版本 v1.0
 * @描述 用户的业务类
 *********************************/
public class UserService {
	UserDao ud = new UserDao();

	public Users login(String name, String passwd) {

		Users user = null;
		try {
			// 调用dao登录方法
			// 事务
			user = ud.login(name, passwd);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ud.closeConnection();
		}

		return user;

	}

	/**
	 * @作者 alex
	 * @日期 2018年10月17日-上午1:09:32
	 * @描述
	 */
	public int regist(Users user) {
		int result = 0;
		try {
			result = ud.regist(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ud.closeConnection();
		}
		return result;

	}

	/**
	 * @作者 alex
	 * @日期 2018年10月17日-下午10:11:06
	 * @描述
	 */
	public List<Users> finAll() {
		List<Users> list = new ArrayList<Users>();
		try {
			list = ud.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ud.closeConnection();
		}
		return list;
	}

	/**
	 * @作者 alex
	 * @日期 2018年11月18日-下午11:49:40
	 * @描述
	 */
	public Users serchUserId(String user_ID) {
		Users user = new Users();
		try {
			user = ud.serchUserId(user_ID);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ud.closeConnection();
		}

		return user;
	}

	/**
	 * @作者 alex
	 * @日期 2018年11月19日-下午7:22:16
	 * @描述
	 */
	public int EditStu(String userId, String username, String password, int userage) {
		int result = 0;
		try {
			result = ud.EditStu(userId, username, password, userage);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ud.closeConnection();
		}

		return result;
	}

}
