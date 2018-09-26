package com.lyn0801.dao;

import java.sql.Connection;

import com.lyn0801.model.User;

public interface UserDao {
	public User login(Connection conn, User user) throws Exception;
}
