<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  <hr>

  <h4><u>A User will be returned here: </u></h4>
  <h3>Username: ${user.name}</h3>
  <h3>Country: ${user.country}</h3>
  <h3>Favourite Programming Language: ${user.favProLang}</h3>
  <h4>Password: ${user.password.length()>0 ? "YES": "NO"}</h4>

  <h3>Operating Systems:<br></h3>
  <ul>
    <c:forEach var="temp" items="${user.favOperatingSystems}" >
      <li>${temp}</li>
    </c:forEach>
  </ul>


  </body>
</html>
