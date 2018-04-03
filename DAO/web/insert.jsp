<%--
  Created by IntelliJ IDEA.
  User: Soksan
  Date: 16-Mar-18
  Time: 4:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert</title>
</head>
<body>
    <form action="OPServlet.java" method="post">
        Username :<input type="text" name="name"><br>
        Age :<input type="text" name="age"><br>
        <input type="hidden" name="op" value="insert"><br>
        <input type="submit" value="Insert">
    </form>
</body>
</html>
