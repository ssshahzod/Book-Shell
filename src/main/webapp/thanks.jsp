<%--
  Created by IntelliJ IDEA.
  User: cronion
  Date: 29.06.2022
  Time: 14:57
  To change this template use File | Settings | File Templates.
  <link rel ="stylesheet" href="Styles/main.css" type="text/css">
--%>

<%@ page import="com.example.javaee.Servlets.EmailListServlet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Email list</title>

</head>
<body>
<h1>Thanks for joining our email list</h1>
<p>Here is the information that you enetered:</p>

<%  String email = request.getParameter("email");
    String firstName = request.getParameter("firstName");
    String secondName = request.getParameter("secondName");
%>

<label>Email:<%= email %> <br> </label>
    <label>First name:<%= firstName %><br></label>
    <label>Second name:<%= secondName %><br></label>
    <p>To enter another email address, click on the button below.</p>

<form action="" method="post">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">

</form>
</body>
</html>
