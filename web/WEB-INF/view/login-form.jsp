<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Log In</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>

<h1><b>Login here</b></h1>
<i>Asterisk (*) means required field.</i>
<hr>
<form:form action="loginForm" modelAttribute="user">


    Name (*): <form:input path="name"/>
                <form:errors path="name" cssClass="error"/>
    <br><br>

    Password: <form:password path="password" />
    <br><br>

    Country Preference: <form:select path="country">
                            <form:option value="GR">Greece</form:option>
                        </form:select>
    <br><br>
    Preferred framework:<br>
        <form:radiobutton path="favProLang" value="Spring"/>Spring
        <form:radiobutton path="favProLang" value="Spring-Boot"/>Spring-Boot
        <form:radiobutton path="favProLang" value="Java EE"/>Java EE
    <br><br>
    Operating Systems:<br>
        <form:checkbox path="favOperatingSystems" value="Windows"/>Windows
        <form:checkbox path="favOperatingSystems" value="OS X"/>OS X
        <form:checkbox path="favOperatingSystems" value="Linux"/>Linux
    <br><br>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
