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
		<!--  -->
		<c:choose>
			<c:when test="${ isNew == true }">
				<h3 align="center">Add student</h3>
			</c:when>
			<c:otherwise>
				<h3 align="center">Update student</h3>
			</c:otherwise>
		</c:choose>
		<!--  -->
		<form:form action="saveOrUpdateStudent" modelAttribute="student" method="post">
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
	        <form:button>Save</form:button>  
		</form:form>
	</div>
</body>
</html>