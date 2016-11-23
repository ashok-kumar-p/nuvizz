<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring web</title>
</head>
<body>
	<h1>This is welcome page.,.,</h1>
	<form:form method="post" commandName="dto" action="login.do">
		<spring:message code="label.userid" />
		<form:input path="userid" />
		<form:errors path="userid" />
		<spring:message code="label.password" />
		<form:input path="pwd" />
		<form:errors path="pwd" />
		<a href="?language=da">Denmark</a>
		<form:button value="Submit">Submit</form:button>
	</form:form>
	<%-- <form action="login.do" method="POST">
		<pre>
User Id  :<input type="text" name="userid" id="userid" /> 
Password :<input type="password" name="pwd" id="password" />
<input type="submit" value="Login" id="login" />
</pre>
	</form> --%>
</body>
</html>