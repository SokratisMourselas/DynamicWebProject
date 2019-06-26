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
  <h3>Username: <b>${user.name}</b></h3>
  <h3>Country: <b>${user.country}</b></h3>
  <h3>Postal/ZIP Code: <b>${user.postalCode}</b></h3>
  <h3>Course Code: <b>${user.courseCode}</b></h3>
  <h3>Favourite Programming Language: <b>${user.favProLang}</b></h3>
  <h4>Password: <b>${user.password.length()>0 ? "YES": "NO"}</b></h4>

  <h3>Operating Systems:<br></h3>
  <ul>
    <c:forEach var="temp" items="${user.favOperatingSystems}" >
      <li><b>${temp}</b></li>
    </c:forEach>
  </ul>


  </body>
</html>
