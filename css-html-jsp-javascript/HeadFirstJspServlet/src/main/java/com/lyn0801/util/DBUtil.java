package com.lyn0801.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	private String dburl = "jdbc:mysql://127.0.0.1/db_jsp";
	private String dbUserName = "root";
	private String dbPassWord = "123456";
	private String dbDriver = "com.mysql.jdbc.Driver";

	public Connection getConn() throws Exception {
		Class.forName(dbDriver);
		Connection conn = DriverManager.getConnection(dburl, dbUserName, dbPassWord);
		return conn;
	}

	public void close(Connection conn) throws Exception {
		if (conn != null) {
			conn.close();
		}
	}

	public static void main(String[] args) {
		DBUtil dbUtil = new DBUtil();
		try {
			dbUtil.getConn();
			System.out.println("连接成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
