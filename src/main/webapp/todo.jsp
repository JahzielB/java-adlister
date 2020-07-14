<%--
  Created by IntelliJ IDEA.
  User: jahzy
  Date: 7/14/20
  Time: 4:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>To Do</title>
</head>
<body>
    <h1>Here are your To Do's:</h1>
    <p><%= request.getParameter("item")%></p>
    <p><%= request.getMethod()%></p>
</body>
</html>
