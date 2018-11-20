package com.lut.person.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lut.person.entity.Ideas;
import com.lut.person.entity.Users;

/*********************************
 * @类名 IdeaDao.java 
 * @作者 alex
 * @日期 2018年11月20日-下午1:58:11
 * @版本 
 * @描述 
 *********************************/
public class IdeaDao  extends BaseDao{
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public int IdeaEdit(Ideas idea) {
		int result = 0;
		try {
			connection = getConnection();
			String sql = "insert into ideas (user_ID, user_Idea) value(?,?) ";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, idea.getUser_ID());
			pstmt.setString(2, idea.getIdeas());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}
