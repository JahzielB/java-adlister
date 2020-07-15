<%--
  Created by IntelliJ IDEA.
  User: jahzy
  Date: 7/15/20
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <%@ include file="partials/nav.jsp"%>
    <form action="login.jsp" method="post">
        <label for="username">Username: </label>
        <input type="text" name="username" id="username">
        <label for="password">Password: </label>
        <input type="password" name="password" id="password">
        <button type="submit">Submit</button>
    </form>
    <c:choose>
        <c:when test="${param.username.equals('admin') && param.password.equals('password')}">
            <%response.sendRedirect("/profile.jsp");%>
        </c:when>
    </c:choose>
    <%@ include file="partials/footer.jsp"%>
</body>
</html>
