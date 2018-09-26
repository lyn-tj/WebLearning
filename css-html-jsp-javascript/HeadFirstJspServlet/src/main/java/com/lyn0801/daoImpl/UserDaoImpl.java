package com.lyn0801.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lyn0801.dao.UserDao;
import com.lyn0801.model.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User login(Connection conn, User user) throws Exception {
		String sql = "select * from t_user where username = ? and password = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		ResultSet rs = pstmt.executeQuery();
		User resultUser = null;
		while(rs.next()){
			resultUser = new User();
			resultUser.setUserName(rs.getString("username"));
			resultUser.setPassword(rs.getString("password"));
		}
		return resultUser;
	}

}
