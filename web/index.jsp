<%--
  Created by IntelliJ IDEA.
  User: Dhruva Juloori
  Date: 11/16/2017
  Time: 5:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="style.css"/>
  <title>Login</title>
</head>
<body>
<div id ="login">
  <form action="Usercontroller" method="post">
    <h2>Sign In</h2>
    <b>Username</b>: <input type="text" name = "username" placeholder="
    Enter Username" />
    <b>Password</b>: <input type="password" name = "password" placeholder="
    Enter Password" />
    <input type="submit" id = "login-button" value = "Login"
    />
  </form>
</div>
</body>
</html>
