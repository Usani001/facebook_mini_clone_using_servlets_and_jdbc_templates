<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.*" %>
<%@ page import="com.facebookclonemini.ClientReg" %>
<%@ page import="com.facebookclonemini.ClientReg" %>
<%@ page import="com.facebookclonemini.FacebookPost" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>

<body>
<h1><%= "Hello World!" %>
</h1>
<h2>
<% for (int i = 1; i < 5; i++) {
    out.println("<br/>Number: "+i);
}



%>
</h2>
<button>like</button>
<%=("Its nice having you here")%>
<form action="facebook_page.jsp">
 firstName<input type="text" value=""><br/>

 LastName: <input type="text"  value="LastName"><br/>

    <input type="button" value="submit">
</form>

<br/>
<%=request.getHeader("User-Agent")%><br/>

<%=request.getLocale()%><br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>