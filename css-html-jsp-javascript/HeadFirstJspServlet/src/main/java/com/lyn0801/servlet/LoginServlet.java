package com.lyn0801.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lyn0801.dao.UserDao;
import com.lyn0801.daoImpl.UserDaoImpl;
import com.lyn0801.model.User;
import com.lyn0801.util.DBUtil;

public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DBUtil DBUtil = new DBUtil();
	private UserDao UserDao = new UserDaoImpl();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password= request.getParameter("password");
		Connection conn = null;
		try {
			User user = new User(userName, password);
			conn = DBUtil.getConn();
			User currentUser = UserDao.login(conn, user);
			if(currentUser == null){
				System.out.println("fail");
				request.setAttribute("error", "用户名或密码错误");
				request.setAttribute("userName", userName);
				request.setAttribute("password", password);
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}else{
				System.out.println("success");
				HttpSession session = request.getSession();
				session.setAttribute("currentUser", currentUser);
				response.sendRedirect("main.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
