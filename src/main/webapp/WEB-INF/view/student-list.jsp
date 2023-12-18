<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student management application</title>
		<link rel="stylesheet" type="text/css"
			  href="/student_management/URLToReachResourcesFolger/css/app-style-sheet.css">
	</head>
<body class="myFonts">
	<h1 align="center">Student management</h1>
	<div align="center">
		<!--  -->
		<form action="studentCreateForm">
			<input type="submit" value="ADD" class="myBotton">
		</form>
		<!--  -->
		<table border="1">
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
							<a href="/student_management/studentUpdateForm?id=${student.id}"
							   style="color: blue">Update</a>
						</td>
						<td>
							<a href="/student_management/deleteStudent?id=${student.id}"
							   onclick="if ( !(confirm('Are you sure you want to delete this student?')) ) return false"
							   class="myDeleteBotton">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<img alt="fake students foto"
			 src="/student_management/URLToReachImagesFolger/student-management.jpg">
	</div>
</body>
</html>