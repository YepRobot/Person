package com.lut.person.service;

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
    	
    	Users user =null;
    	try {
			//调用dao登录方法 
			//事务
			user = ud.login(name, passwd); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ud.closeConnection();
		}
		
		return user;
    	
    }
   
}
