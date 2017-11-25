<!DOCTYPE html>

<html lang="en-US">
<head>
    <meta charset="utf-8">
    <title>Signup</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,700">
    <link rel = "stylesheet" href="style.css">
</head>
<body>
<div id="login">
    <Center><h1><font color="white" style="font-family: cursive;"><i class="fa fa-pencil-square-o" style="font-size: 29px; text-align:center; padding-left: 10px; color: white;" aria-hidden="true" ></i> WHITEBOARD </font> </h1></Center>
    <form action= "Signupcontroller" method="post">
        <span class="fontawesome-user"></span>
        <input type="text" name="username" placeholder="Username" required>
        <span class="fontawesome-user"></span>
        <input type = "text" name="usertype" placeholder="Usertype" required>
        <span class="fontawesome-lock"></span>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Register">
    </form>
</div>
</body>
</html>
