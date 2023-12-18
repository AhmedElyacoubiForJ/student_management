<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student management application</title>
		<!--  <link rel="stylesheet" type="text/css"
			  href="/student_management/URLToReachResourcesFolger/css/app-style-sheet.css">
		-->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	</head>
<body>
	<h1 align="center" class="display-3">Student management</h1>
	
	<div align="center" class="container">
		<!--  -->
		<div class="mb-3" align="left">
			<form action="studentCreateForm">
				<input type="submit" value="ADD" class="btn btn-primary">
			</form>
		</div>
		<!--  -->
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<td>ID</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
					<td colspan="2" align="center">Actions</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="student" items="${students}">
					<tr>
						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${student.mobile}</td>
						<td>${student.country}</td>
						<td>
							<div align="center">
								<a href="/student_management/studentUpdateForm?id=${student.id}"
								   class="btn btn-primary" >Update</a>
							</div>
						</td>
						<td>
							<div align="center">
								<a href="/student_management/deleteStudent?id=${student.id}"
								   onclick="if ( !(confirm('Are you sure you want to delete this student?')) ) return false"
								   class="btn btn-danger">Delete</a>
							 </div>  
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<img alt="fake students foto"
			 src="/student_management/URLToReachImagesFolger/student_management.jpg"
			 class="rounded"
			 width="100%">
	</div>
</body>
</html>