<%--
  Created by IntelliJ IDEA.
  User: cronion
  Date: 14.07.2022
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email list</title>
</head>
<body>
<h1>An unexpected error occurred!</h1>
<%
    String error = request.getParameter("Error");
%>
<%= error %>

<form action="" method="post">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">

</form>
</body>
</html>
