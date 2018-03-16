<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <%//if we use application despite of session it will continue count in every browser
      Integer counter=(Integer)session.getAttribute("counter");//Integer counter=(Integer)application.getAttribute("counter");
      if(counter==null||counter==0)
      {
          counter=1;
      }
      else
      {
          counter=counter*17;
      }
      out.println(counter);
      session.setAttribute("counter",counter);//session.setAttribute("counter",counter);
    %>
  </body>
</html>