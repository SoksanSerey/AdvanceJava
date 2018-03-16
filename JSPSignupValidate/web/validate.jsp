<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Soksan
  Date: 09-Feb-18
  Time: 8:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validate the program</title>
</head>
<body>
    <%
        String name=request.getParameter("name");
        String pass=request.getParameter("pass");
        String conPass=request.getParameter("conPass");
        String mail=request.getParameter("mail");
        String phonenum=request.getParameter("phone");
        String bd=request.getParameter("bd");

        ArrayList<String> err=new ArrayList();

        if(name==null)
        {
            err.add("Name cannot be null");
        }
        char a[]=name.toCharArray();
        for(char name1:a)
        {
            if(Character.isDigit(name1))
            {
                err.add("Your name cannot contain number");
            }
        }

        if(pass.contains("[a-z]")&&pass.contains("[A-Z]")&&pass.contains("[0-9]"))
        {
            err.add("Password need to contain at least one UPPER CASE, lowercase and number");
        }
        else if(pass.matches(conPass))
        {
            err.add("Password not match");
        }

        if(!mail.contains("@")&&!mail.contains("."))
        {
            err.add("Email does not valid");
        }

        if(phonenum.length()>9||phonenum.length()<5)
        {
            err.add("Phone number is not valid");
        }
        if(err.size()>0)
        {
            out.println(err);
        }
        else
        {
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }

//        if(name.contains("[a-zA-Z0-9]")==false)//name.contains(".*//d.*")&&
//        {
//            if(pass.contains("[a-zA-Z]")==false&&pass.matches("")){
//
//            }
//        }
//        else
//        {
//            RequestDispatcher requestDispatcher=request.getRequestDispatcher("fail.jsp");
//            requestDispatcher.forward(request,response);
//        }
//        else if(pass.contains("[a-zA-Z0-9]")==false&&pass.contains("[a-zA-Z0-9]"))//pass.contains(".*//d.*")&&
//        {
//            RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
//            rd.forward(request,response);
//        }
    %>
</body>
</html>
