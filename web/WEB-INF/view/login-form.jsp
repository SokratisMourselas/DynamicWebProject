<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Log In</title>
</head>
<body>

<h1><b>Login here</b></h1>
<hr>
<form:form action="loginForm" modelAttribute="user">


    First Name: <form:input path="name"/>
    <br><br>

    Password: <form:input path="password" />
    <br><br>

    Country Preference: <form:select path="country">
                            <form:options items="${theCountryOptions}"/>

                        </form:select>
    <br><br>

    <input type="submit" value="Submit">
</form:form>

</body>
</html>
