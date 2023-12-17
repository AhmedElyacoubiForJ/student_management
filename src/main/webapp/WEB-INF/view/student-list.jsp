<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student management</title>
</head>
<body>
	<h1 align="center">List of students</h1>
	<div align="center">
		<!--  -->
		<form action="createStudentForm">
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
					<th>Actions</th>
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
							<div class="display: inline-block">
								<a href="/student_management/updateStudentForm?id=${student.id}" style="color: blue">Update</a>
								<a href="/student_management/deleteStudent?id=${student.id}" style="color: red">Delete</a>
							</div>
        				</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>