<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello from index page</h1>
<form action="registration" method="post">
 <label for="lname">id:</label>
  <input type="number" id="id" name="id" required><br><br>
  <label for="fname">name:</label>
  <input type="text" id="name" name="name" required><br><br>
    <label for="designation">designation:</label>
  <input type="text" id="id" name="designation" required><br><br>
   <label for="password">password:</label>
  <input type="text" id="lname" name="password" required><br><br>
  <input type="submit" value="Submit">
</form>
</body>
</html>