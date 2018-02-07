<%--
  Created by IntelliJ IDEA.
  User: Soksan
  Date: 01-Feb-18
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>--%>
<%! String user; %>
<%
    user=request.getParameter("name");

%>
Welcome : <%= user%>