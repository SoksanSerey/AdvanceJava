<%@ page import="sun.plugin.com.Dispatcher" %><%--
  Created by IntelliJ IDEA.
  User: Soksan
  Date: 16-Mar-18
  Time: 4:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validate</title>
</head>
<body>
    <%
        String ch;
        ch = request.getParameter("choice");
        if(ch.equals("insert"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("Insert.jsp");
            rd.forward(request,response);
        }
        else if (ch.equals("update"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("Update.jsp");
            rd.forward(request,response);
        }
    %>
</body>
</html>
