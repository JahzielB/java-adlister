<%--
  Created by IntelliJ IDEA.
  User: jahzy
  Date: 7/16/20
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Ads" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />
    <ul class="list-group">
        <c:forEach items="${ads}" var="ad">
            <li class="list-group-item">${ad.id} - ${ad.title} - ${ad.description}</li>
        </c:forEach>
    </ul>
</body>
</html>
