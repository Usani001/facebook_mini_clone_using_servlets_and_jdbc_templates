<%--
  Created by IntelliJ IDEA.
  User: decagon
  Date: 6/18/23
  Time: 2:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>Student confirmation Title</title>
</head>
<body>
    The student is confirmed: ${param.firstName} ${param.lastName}
    <br/><br/>
    The Student's country: ${param.country}
    <br/><br/>
    The Student's favourite language is: ${param.favouriteLanguage};
    <br/><br/>
    The Student's favourite languages are:
    <%
        String[] langs = request.getParameterValues("favouriteLanguages");
        for (String tempLangs: langs)
        out.println("<li>"+tempLangs + " </li>");
    %>

</body>
</html>
