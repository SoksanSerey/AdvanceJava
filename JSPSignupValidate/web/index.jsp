<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sign up Page</title>
  </head>
  <body>
    <form action="validate.jsp">
      Username : <input type="text" name="name"><br>
      Create password : <input type="password" name="pass"><br>
      Confirm Password : <input type="password" name="conPass"><br>
      Email : <input type="email" name="mail"><br>
      Birth date : <input type="date" name="bd"><br>
      Phone number : <input type="number" name="phone"><br>
      <input type="submit" value="Sign up">
    </form>
  </body>
</html>