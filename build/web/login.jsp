<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>login page</title>
    </head>
    <body bgcolor="antiquewhite">
    <center>
        <font color="blue" size="6">Login</font> <br>
        <form action="checklogin.jsp" method="post">
         ENTER USERNAME  <input type="text" name="USERNAME">
         ENTER PASSWORD <input type="password" name="PASSWORD"> <br><br>
         <input type="submit" value="login" >
        </form>
    </center>
    </body>
</html>
