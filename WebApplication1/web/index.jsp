<%-- 
    Document   : index
    Created on : Nov 22, 2017, 3:44:09 AM
    Author     : Soksan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="NewServlet" method="get">
            <label>Username : </label>
            <input type="text" name="username"><br>
            <label>Password: </label>
            <input type="password" name="password"><br>
            <input type="submit" value="Login">
        </form>
    </body> 
</html>
