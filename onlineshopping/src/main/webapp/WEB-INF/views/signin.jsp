<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url var="css" value="/assets/css" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
</style>
<link rel="stylesheet" href="${css}/w3.css">
</head>
<body>
<div style="width:50%;margin-left:25%;margin-top:12%">
	<div class="w3-card-4">
  <div class="w3-container w3-green">
    <h2>Sign In</h2>
  </div>
  <form:form class="w3-container" action="verify.htm" modelAttribute="shop">
    <p>      
    <label class="w3-text-green"><b>Phone Number</b></label>
    <form:input class="w3-input w3-border " path="phoneNo"/></p>
    <p>      
    <label class="w3-text-green"><b>Password</b></label>
    <form:input class="w3-input w3-border" path="password"/></p>
    <p>
    <input type="submit" class="w3-btn w3-green" value="Sign In"/></p>
  </form:form>
</div>
	</div>
</body>
</html>