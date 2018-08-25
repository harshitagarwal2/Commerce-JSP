<%
    HttpSession s = request.getSession(true);
    s.invalidate();
    %>
<html>
    <head>
        
        <title>logging off</title>
    </head>
    <body bgcolor="antiquewhite">
<center>
    <img src="C:\Users\harshit\Desktop\download.jpg" alt=""/>
        <br><br><br><h1>You have logged out successfully</h1>
        <a href="welcome.jsp">click here to login again</a>
</center>    
</body>
</html>
