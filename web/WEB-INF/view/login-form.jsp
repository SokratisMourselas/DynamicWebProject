<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Log In</title>
</head>
<body>

<h1><b>Login here</b></h1>
<hr>
<form action="login"  method="POST">
    <input type="text" name="username" placeholder="Username"><br>
    <input type="password" name="password" placeholder="Password"><br>
    <input type="submit">
</form>

</body>
</html>
