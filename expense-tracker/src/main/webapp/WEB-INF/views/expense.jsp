<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath }" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add expense</title>
</head>
<body>
<h1>Add Expense</h1>
<form:form action="${contextRoot}/expense" method="post" modelAttribute="expense" >
<form:hidden path="id" />
<form:input path="expensename" placeholder="Enter expense name"/>
<form:input path="amount" placeholder="amount"/>
<form:textarea path="note" placeholder="Enter note (optional)" />
<button type="submit">Add expense</button>
</form:form>
	<a href="${contextRoot }/expense/${expense.id}/delete">Delete</a>
</body>
</html>