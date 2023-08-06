<%--
  Created by IntelliJ IDEA.
  User: decagon
  Date: 6/18/23
  Time: 5:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Training Portal</title>
</head>

<%
  String favLang = "Java";
  Cookie[] cookies = request.getCookies();
  if (cookies != null){
    for (Cookie tempCookie: cookies){
      if ("myApp.favouriteLanguage".equals(tempCookie.getName())){
        favLang = tempCookie.getValue();
      }
    }
  }
%>

<h4> New Books for <%=favLang%></h4>
<ul>
  <li>blah blah blah</li>
  <li>blah blah blah</li>
  <li>blah blah blah</li>
</ul>

<h4> Latest news report for <%=favLang%></h4>
<ul>
  <li>blah blah blah</li>
  <li>blah blah blah</li>
  <li>blah blah blah</li>
</ul>

<h4> Hot jobs for <%=favLang%></h4>
<ul>
  <li>blah blah blah</li>
  <li>blah blah blah</li>
  <li>blah blah blah</li>
</ul>
<hr>
<a href="cokies-personalize-form.html">Personalize this page</a>
</html>
