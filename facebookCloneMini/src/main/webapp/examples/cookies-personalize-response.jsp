<%--
  Created by IntelliJ IDEA.
  User: decagon
  Date: 6/18/23
  Time: 4:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation</title>
</head>
<body>
<%
  // read form data
  String favLang = request.getParameter("favouriteLanguage");

  //create the cookie
  Cookie cookie = new Cookie("myApp.favouriteLanguage", favLang);

  //setting life span of cookie
  cookie.setMaxAge(60*60*24*365);

  // to send cookie to browser
  response.addCookie(cookie);
%>
Thanks! We set your favourite language to: ${param.favouriteLanguage}
<br/><br/>
<a href="cookies-homepage.jsp">Return to homepage.</a>
</body>
</html>
