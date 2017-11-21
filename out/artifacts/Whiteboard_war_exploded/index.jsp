<!DOCTYPE html>

<html lang="en-US">
<head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,700">
    <link rel = "stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div id="login">
    <Center><h1><font color="white" style="font-family: cursive;"><i class="fa fa-pencil-square-o" style="font-size: 29px; text-align:center; padding-left: 10px; color: white;" aria-hidden="true" ></i> WHITEBOARD </font> </h1></Center>
    <form action= "Usercontroller" method="post">
        <span class="fontawesome-user"></span>
        <input type="text" name="username" placeholder="Username">
        <span class="fontawesome-lock"></span>
        <input type="password" name="password" placeholder="Password">
        <input type="submit" value="Login">
        <a href="signup.jsp" class="submit" style="padding-left: 85px;color: white;">Click here to Register!</a>
    </form>
</div>
</body>
</html>
