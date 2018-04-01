<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveproduct.htm" modelAttribute="product" method="post">
		<form:input path="productName"/><br/>
		<form:input path="productPrice"/><br/>
		<form:input path="salePercent"/><br/>
		<form:textarea path="shortDescription"/><br/>
		<form:select path="category">
			<form:options items="${categories }" itemLabel="categoryName" itemValue="categoryId"/>
		</form:select>
			<!--  add an input tag for image -->
			<form:hidden path="shop.shopId"/>
			<input type="submit">
	</form:form>
</body>
</html>