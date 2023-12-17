<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3 align="center">${(create == true) ? "Add student" : "Update student"}</h3>
		<form:form  action="${action}" modelAttribute="student" method="post">
			<form:hidden path="id"/>
			
			<form:label path="name">Name : </form:label >
			<form:input path="name"></form:input>
			<br />	
			<form:label path="mobile">Mobile : </form:label>
			<form:input path="mobile"></form:input>
			<br />
			<form:label path="country">Country : </form:label>
			<form:input path="country"></form:input>
			<br />
			
	        <form:button>Submit</form:button>  
		</form:form>
	</div>
</body>
</html>