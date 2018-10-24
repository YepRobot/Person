package com.lut.person.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lut.person.entity.Users;

/*********************************
 * @类名 UserDao.java 
 * @作者 alex
 * @日期 2018年10月11日-下午7:37:17
 * @版本 v1.0
 * @描述 
 *********************************/
public class UserDao extends BaseDao{
	private PreparedStatement pstmt =null;
	private ResultSet rs = null;  
	public Users login(String name,String password) {
		
		Users user = null;
		try {
		connection=getConnection();
		
		String sql = "SELECT * FROM user_info WHERE user_Name=? and user_Password=?";
		
		
		pstmt = connection.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery();
		if(rs.next()) {
			user = new Users();
			user.setUser_ID(rs.getString("user_ID"));
			user.setUser_Name(rs.getString("user_Name"));
			user.setUser_Password(rs.getString("user_Password"));
			user.setUser_Power(rs.getInt("user_Power"));
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		return user;
		
	}
	/**
	 * @作者 alex
	 * @日期 2018年10月17日-上午1:11:06
	 * @描述   用户注册
	 */
	public int regist(Users user) {
		int result = 0;
		try {
			connection=getConnection();
			String sql="insert into user_info "
					+ "(user_ID, user_Name, user_Password, user_Gender, user_Age, user_Power,user_Status) "
					+ "value(?,?,?,?,?,?,1)";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, user.getUser_ID());
			pstmt.setString(2,user.getUser_Name());
			pstmt.setString(3, user.getUser_Password());
			pstmt.setInt(4, user.getUser_Gender());
			pstmt.setInt(5,user.getUser_Age());
			pstmt.setInt(6, user.getUser_Power());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	/**
	 * @作者 alex
	 * @日期 2018年10月17日-下午10:15:26
	 * @描述   查询所有学生信息 
	 */
	public List<Users> findAll() {
		List<Users> list = new ArrayList<Users>();
		try {
			//创建connection
			connection=getConnection();
			String sql="select * from user_info where user_Status=1";
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Users user = new Users();
				
				user.setUser_ID(rs.getString("user_ID"));
				user.setUser_Name(rs.getString("user_Name"));
				user.setUser_Age(rs.getInt("user_Age"));
				user.setUser_Gender(rs.getInt("user_Gender"));
				
			
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
