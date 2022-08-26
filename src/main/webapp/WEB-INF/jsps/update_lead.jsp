<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update Laed</title>
</head>
<body>
<h2>update here...</h2>
<form action="updatelead" method="post">
<input type="hidden" name="id" value ="${lead.id }">
FirstName:<input type="text" name="firstName" value ="${lead.firstName }"><br>
LastName:<input type="text" name="lastName"value ="${lead.lastName }"><br>
Email:<input type="text" name="email"value ="${lead.email }"><br>
Mobile:<input type="text" name="mobile"value ="${lead.mobile }"><br>
<input type="submit" value="update">
</form>
${msg }
</body>
</html>