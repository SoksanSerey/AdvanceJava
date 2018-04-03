<%--
  Created by IntelliJ IDEA.
  User: Soksan
  Date: 09-Feb-18
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page errorPage="error.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validate</title>
</head>
<body>
    <%
        String num1=request.getParameter("firstNum");
        String num2=request.getParameter("secondNum");

        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);

        int res=n1/n2;
        out.println(res);
    %>
</body>
</html>
