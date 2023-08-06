<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="./style.css">
    <title>New User Sign up Page</title>
</head>
<body class="signup-body">
<h1><%="Create new account"%></h1>
<form action=<%=request.getContextPath()%>"registerServlet"  method="get">
    UserName: <input type="text" name="firstName" placeholder="e.g: John">
    Last Name:<input type="text" name="lastName">
    Email Address:<input type="text" name="emailAddress">
    <br/><br/>
    Date of Birth:<input type="date" name="birthDay">
    <br/><br/>
    Gender:<input type="text" name="gender">
    <br/><br/>
    Country:<input type="text" name="country">
    <br/><br/>
    Username:<input type="text" name="userName">
    <br/><br/>
    Password:<input type="text" name="password">
    <br/><br/>


    <input type="submit" value="Submit">
</form>


</body>
</html>
