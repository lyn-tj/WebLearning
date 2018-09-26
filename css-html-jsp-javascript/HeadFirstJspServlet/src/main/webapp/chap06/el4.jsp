<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.jspServlet.model.People" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<People> list = new ArrayList<People>();
	People people = new People();
	people.setId(1);
	people.setName("张三");
	people.setAge(39);
	list.add(0, people);
	people = new People();
	people.setId(2);
	people.setName("李四");
	people.setAge(22);
	list.add(1, people);
	request.setAttribute("list", list);
%>
<h1>${list[0] }</h1>
<h1>${list[1] }</h1>
</body>
</html>