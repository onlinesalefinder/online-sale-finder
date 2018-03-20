<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url var="css" value="/assets/css" />
<spring:url var="js" value="/assets/js" />
<spring:url var="images" value="/assets/images" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Online sale finder</title>

<!-- Bootstrap core CSS -->
<link href="${css }/bootstrap.css" rel="stylesheet">

<!-- Add custom CSS here -->
<link href="${css }/shop-homepage.css" rel="stylesheet">


</head>

<body>

	<div class="wrapper">

		<%@include file="./shared/navbar.jsp"%>
		<!-- /.container -->

		<div class="content">
			<c:if test="${userClicksHome == true }">
				<%@include file="home.jsp"%>
			</c:if>
			<c:if test="${userClicksAbout == true }">
				<%@include file="about.jsp"%>
			</c:if>
			<c:if test="${userClicksContact == true }">
				<%@include file="contact.jsp"%>
			</c:if>
		</div>
		<%@include file="./shared/footer.jsp"%>
		<!-- /.container -->

		<!-- JavaScript -->
		<script src="${js }/jquery-1.10.2.js"></script>
		<script src="${js }/bootstrap.js"></script>
	</div>
</body>
</html>