<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h1>Enter details for update</h1>
<form action="doUpdate" method="get">
 <label for="lname">id:</label>
  <input type="number" id="id" name="id" required value=${id} readonly><br><br>
  <label for="fname">name:</label>
  <input type="text" id="name" name="name" required value=${name}><br><br>
    <label for="designation">designation:</label>
  <input type="text" id="id" name="designation" required value=${designation}><br><br>
   <label for="password">password:</label>
  <input type="text" id="lname" name="password" required value=${password}><br><br>
  <input type="submit" value="Update details">
</form>
</body>
</html>