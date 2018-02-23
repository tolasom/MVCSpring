<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h1>Welcome...........</h1><br>
  <form action="RegisterServlet" method="post">
    ID       : <input type="text" name="id"><br>
    AGE      : <input type="text" name="age"><br>
    NAME     : <input type="text" name="name"><br>
    EMAIL    : <input type="text" name="email"><br>
    PASSWORD : <input type="text" name="pass"><br><br>
    <input type="submit" value="Register"><br>
    <%--<input type="submit" value="Database">--%>
  </form>

  </body>
</html>