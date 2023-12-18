<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css"
			  href="/student_management/URLToReachResourcesFolger/css/add-student.css">
		<link rel="stylesheet" type="text/css"
			  href="/student_management/URLToReachResourcesFolger/css/app-style-sheet.css">
	</head>
<body>
	<div align="center">
		<h1 align="center">${(create == true) ? "Add student" : "Update student"}</h1>
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
			
	        <form:button class="myBotton">Submit</form:button>  
		</form:form>
	</div>
</body>
</html>