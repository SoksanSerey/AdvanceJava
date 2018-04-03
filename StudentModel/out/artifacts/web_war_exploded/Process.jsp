<%--
  Created by IntelliJ IDEA.
  User: Soksan
  Date: 20-Feb-18
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UseBean Test</title>
</head>
<body>
    <jsp:useBean class="StudentModel" id="sm1"/>

    <jsp:setProperty name="sm1" property="name"/>
    <jsp:setProperty name="sm1" property="age"/>
    <jsp:setProperty name="sm1" property="id"/>

    <jsp:getProperty name="sm1" property="name"/>
    <jsp:getProperty name="sm1" property="age"/>
    <jsp:getProperty name="sm1" property="id"/>
</body>
</html>
