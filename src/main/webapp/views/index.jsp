<%@ page import="java.util.List" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" />">
</head>
<body>
<%
    String name = (String) request.getAttribute("name");
    List<String> friends = (List<String>) request.getAttribute("f");
%>

<h1>This is <%=name%>
</h1>
<h2>My friend List:</h2><br>
<%
    for (String s : friends){
%>
    <h2><%=s%></h2>
<%
    }
%>
</body>
</html>