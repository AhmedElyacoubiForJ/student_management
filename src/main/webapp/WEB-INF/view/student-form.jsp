<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<!--
		<link rel="stylesheet" type="text/css"
			  href="/student_management/URLToReachResourcesFolger/css/add-student.css">
		<link rel="stylesheet" type="text/css"
			  href="/student_management/URLToReachResourcesFolger/css/app-style-sheet.css">
		-->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	</head>
<body>
	<div class="container">
		<h1 align="center" class="display-3">${(create == true) ? "Add student" : "Update student"}</h1>
		
		
		<form:form  action="${action}" modelAttribute="student" method="post">
			<form:hidden path="id"/>
			
			<div class="form-group row">
				<form:label path="name" class="col-sm-2 col-form-label">Name:</form:label>
				<div class="col-sm-5">
					<form:input path="name" class="form-control"></form:input>
				</div>
			</div>
			<div class="form-group row">
				<form:label path="mobile" class="col-sm-2 col-form-label">Mobile:</form:label>
				<div class="col-sm-5">
					<form:input path="mobile" class="form-control"></form:input>
				</div>
			</div>
			<div class="form-group row">
				<form:label path="country" class="col-sm-2 col-form-label">Country:</form:label>
				<div class="col-sm-5">
					<form:input path="country" class="form-control"></form:input>
				</div>
			</div>
			<div align="center">
	        	<form:button class="btn btn-primary mb-2">Submit</form:button>
	        </div> 
		</form:form>
	</div>
</body>
</html>