<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Student management application</title>
		<link rel="stylesheet" type="text/css" href="/student_management/URLToReachResourcesFolger/css/app-style-sheet.css">
	</head>
<body>
	<h1 align="center">Student management</h1>
	<div align="center">
		<!--  -->
		<form action="studentCreateForm">
			<input type="submit" value="ADD">
		</form>
		<!--  -->
		<table border="1">
			<thead>
				<tr>
					<td>ID</td>
					<td>Name</td>
					<td>Mobile</td>
					<td>Country</td>
					<th colspan="2">Actions</th>
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
							   style="color: red">Delete</a>
						</td>
							<!-- div class="display: inline-block">
								<a href="/student_management/studentUpdateForm?id=${student.id}" style="color: blue">Update</a>
								<a href="/student_management/deleteStudent?id=${student.id}" style="color: red">Delete</a>
							</div -->
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>