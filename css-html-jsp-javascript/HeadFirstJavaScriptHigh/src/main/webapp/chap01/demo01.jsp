<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	/*function say(name,age){
		alert(name+"今年"+age+"岁");
	}
	say("张三",3);*/
	
	var sayFunc = new Function("name","age","name+'今年'+age+'岁'");
	sayFunc("李四",4);
</script>
</body>
</html>