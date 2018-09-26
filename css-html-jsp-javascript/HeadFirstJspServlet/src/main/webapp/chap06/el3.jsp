<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jspServlet.model.People" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	People people = new People();
	people.setId(20);
	people.setName("张三");
	people.setAge(39);
	request.setAttribute("people", people);
%>
<h1>编号：${people.id }</h1>
<h1>姓名：${people.name }</h1>
<h1>年龄：${people.age }</h1>
</body>
</html>