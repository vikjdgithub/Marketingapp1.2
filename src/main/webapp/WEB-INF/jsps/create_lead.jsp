<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Laed</title>
</head>
<body>
<h2>Register here...</h2>

<form action="save" method="post">
FirstName:<input type="text" name="firstName"><br>
LastName:<input type="text" name="lastName"><br>
Email:<input type="text" name="email"><br>
Mobile:<input type="text" name="mobile"><br>
<input type="submit" value="save">
</form>
${msg }
</body>
</html>