<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CAD result</title>
</head>
<body>
<p>$${userCad.getUsd()} converts to: $${userCad.convertUSDtoCAD(userCad.getUsd())} CAD. </p>

<a href="index.jsp">Calculate another conversion</a>
</body>
</html>