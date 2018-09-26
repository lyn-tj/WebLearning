package com.lyn0801.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ForwardServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("requestKey", "request值");
		HttpSession session = request.getSession();//获取session
		session.setAttribute("sessionKey", "session值");
		ServletContext application = this.getServletContext();//获取application
		application.setAttribute("applicationKey", "application值");
		RequestDispatcher rd = request.getRequestDispatcher("chap05/target.jsp");//服务器跳转/转发
		rd.forward(request, response);
	}
	

}
