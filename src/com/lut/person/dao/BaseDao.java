package com.lut.person.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*********************************
 * @类名 BaseDao.java
 * @作者 alex
 * @日期 2018年10月8日
 * @版本
 * @描述
 *********************************/
public class BaseDao {
	protected Connection connection = null;

	/**
	 * @作者 alex
	 * @日期 2018年10月8日-上午9:14:13
	 * @描述 获取连接对象
	 */
	public Connection getConnection() {
		try {
			if (connection == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost/person?useSSL=FALSE&serverTimezone=UTC", "root", "123456");
				System.out.println("连接成功");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * 
	 * @作者 alex
	 * @日期 2018年10月8日-上午9:16:55
	 * @描述 关闭数据库连接
	 */
	public void closeConnection() {
		try {
			// 防止 NullPointException异常出现
			if (connection != null) {
				connection.close();
				connection = null; // 置null
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @作者 alex
	 * @日期 2018年10月8日-上午9:18:23
	 * @描述 开启事务
	 */
	public void beginTrans() {
		try {
			connection = this.getConnection();
			connection.setAutoCommit(false); // 关闭自动提交
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @作者 alex
	 * @日期 2018年10月8日-上午9:19:13
	 * @描述 事务的提交
	 */
	public void commit() {
		if (connection != null) {
			try {
				connection.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 * @作者 alex
	 * @日期 2018年10月8日-上午9:20:48
	 * @描述 事务的回滚
	 */
	public void rollback() {
		if (connection != null) {
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
