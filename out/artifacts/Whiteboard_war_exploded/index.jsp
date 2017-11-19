<!DOCTYPE html>

<html lang="en-US">
<head>
    <meta charset="utf-8">
    <title>Login</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,700">
    <link rel = "stylesheet" href="style.css">
</head>

<body>
<Center> <h1> <font color="white">WHITEBOARD </font> </h1></Center>
<div id="login">
    <form action= "Usercontroller" method="post">
        <span class="fontawesome-user"></span>
        <input type="text" name="username" placeholder="Username">

        <span class="fontawesome-lock"></span>
        <input type="password" name="password" placeholder="Password">

        <input type="submit" value="Login">

        <input type = button value = "signup" onclick= "signup.jsp">

    </form>

</div>




</body>
</html>
