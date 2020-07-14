<%--
  Created by IntelliJ IDEA.
  User: jahzy
  Date: 7/14/20
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    String firstname = "Jahziel";
    String lastname = "Baez";
%>
<html>
    <head>
        <title>Mini Exercise</title>
    </head>
    <body>
        <h1>Hello <%=firstname%> <%=lastname%></h1>
        <%@include file="partials/about-me.jsp"%>
        <h3>What would you like to do?</h3>
        <h3>View Your Profile</h3>
        <form action="/user-profile.jsp" method="get">
            <input type="hidden" id="username" name="username" value="Jahziel">
            <input type="hidden" id="lastname" name="lastname" value="Baez">
            <button type="submit">Go There</button>
        </form>

        <h3>Add a To Do</h3>
        <form action="/todo.jsp" method="post">
            <input type="text" id="item" name="item">
            <button type="submit">Add to List</button>
        </form>
    </body>
</html>
