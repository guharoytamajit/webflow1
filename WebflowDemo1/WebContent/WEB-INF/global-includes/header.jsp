<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<link href="headerFiles/jug.css" type="text/css" rel="stylesheet">
<title>JUG's Pizzeria</title>
</head>
<body>
	<div id="outerDiv">
		<div id="mainDiv">
			<h1>${param.title}</h1>
			<div id="errors">
				<spring:hasBindErrors name="flow">
					<spring:bind path="flow.*">
						<c:forEach items="${status.errorMessages }" var="error">
							<c:out value="${error }" />
							<br />
						</c:forEach>
					</spring:bind>
				</spring:hasBindErrors>
				<spring:hasBindErrors name="payment">
					<spring:bind path="payment.*">
						<c:forEach items="${status.errorMessages }" var="error">
							<c:out value="${error }" />
							<br />
						</c:forEach>
					</spring:bind>
				</spring:hasBindErrors>
				<br />
			</div>