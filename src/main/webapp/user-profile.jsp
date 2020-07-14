<%--
  Created by IntelliJ IDEA.
  User: jahzy
  Date: 7/14/20
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hi, <%=request.getParameter("username")%></h1>
<p><%= request.getMethod()%></p>
</body>
</html>
