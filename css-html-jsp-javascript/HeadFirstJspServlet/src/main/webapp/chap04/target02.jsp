<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>Session取值！</h1>
<jsp:useBean id="student" scope="session" class="com.jspServlet.model.Student"></jsp:useBean>
<h1>姓名：<jsp:getProperty property="name" name="student"/></h1>
<h1>年龄：<jsp:getProperty property="age" name="student"/></h1>
</body>
</html>