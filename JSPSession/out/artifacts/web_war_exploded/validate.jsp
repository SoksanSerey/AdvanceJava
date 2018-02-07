<%--
  Created by IntelliJ IDEA.
  User: Soksan
  Date: 07-Feb-18
  Time: 9:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name=request.getParameter("name");
    String pass=request.getParameter("pass");
    if(name.equals("Soksan")&&pass.equals("1234"))
    {
        RequestDispatcher rd=request.getRequestDispatcher("successful.jsp");
        request.setAttribute("name",name);
        rd.forward(request,response);
    }
    else
    {
        RequestDispatcher rd=request.getRequestDispatcher("Destroy.jsp");
        rd.forward(request,response);
    }
%>
