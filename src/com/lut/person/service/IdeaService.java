package com.lut.person.service;

import com.lut.person.dao.IdeaDao;
import com.lut.person.entity.Ideas;
import com.lut.person.entity.Users;

/*********************************
 * @类名 IdeaService.java 
 * @作者 alex
 * @日期 2018年11月20日-下午1:55:29
 * @版本 
 * @描述 
 *********************************/
public class IdeaService {
IdeaDao idao = new IdeaDao();

public int IdeaEdit(Ideas idea) {
	int result = 0;
	try {
		result = idao.IdeaEdit(idea);
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		idao.closeConnection();
	}
	return result;

}
}
