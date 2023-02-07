<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Convert To CAD</title>
</head>
<body>

<h1>Convert USD to CAD</h1>

<form action="getCADServlet" method="post">
<p>Enter the amount in USD you would like to convert to CAD: </p>
<input type="text" name="userUSD" size="10">
<input type="submit" value="Calculate CAD" />
</form> 

<a href="index.jsp">Return to Home Page</a>

</body>
</html>