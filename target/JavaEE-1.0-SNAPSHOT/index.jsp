<%--<%@ page import="com.example.javaee.emailList" %>
  Created by IntelliJ IDEA.
  User: cronion
  Date: 21.06.2022
  Time: 19:04
  To change this template use File | Settings | File Templates.
  <link rel ="stylesheet" href="Styles/main.css" type="text/css">
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email list</title>
</head>
<body>
    <h1>Join our email list</h1>
    <p>To join our email list, enter your name and email address below.</p>
    <form action="emailList" method="post">
        <input type="hidden" name="action" value="add">

        <label>Email:
            <input type="email" name="email" required><br>
        </label>
        <label>First name:
            <input type="text" name="firstName" required> <br>
        </label>
        <label>Second name:
            <input type="text" name="secondName" required> <br>
        </label>
        <label>
            <input type="submit" value="Join Now" id="submit">
        </label>
    </form>


</body>
</html>
