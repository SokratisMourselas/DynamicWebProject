<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: smoursel
  Date: 20-Jun-19
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>

<html>
  <head>
    <title>Main Menu</title>
  </head>
  <body>
  <h2>Initialization of Spring MVC Project</h2>
  <h3 style="margin-left: 50px">------ Inside main-menu.jsp ------</h3>
  <hr>

  <h3><a href="/mainPath/showForm">Go to form</a> </h3>

  <h4>A User will be returned here: </h4>
  <h3>Username: ${user.name}</h3>
  <h3>Country: ${user.country}</h3>
  <h4>${user.password.length()>0 ? "YES": "NO"}</h4>


  </body>
</html>
