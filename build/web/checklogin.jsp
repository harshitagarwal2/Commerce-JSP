<jsp:useBean class="jsp1.userdetails" id="r" scope="request"></jsp:useBean>
<jsp:useBean class="jsp1.logindb" id="db" scope="request"></jsp:useBean>
<jsp:setProperty name="db" property="*" ></jsp:setProperty>
<html>
    <head>
        <title>login </title>
    </head>
    <body>
        <% int id = r.checklogin( db );
        if (id == 0) {
        %>
       
       <title>LOGIN ERROR</title>
    </head>
    <center>
        <font size="6">Please check your username or password</font>
        <a href="login.jsp">Home</a>
        <% }
else  {
         %>
         <jsp:forward page="menu.jsp"></jsp:forward>
        
         <% } %>
    </center>
    
</body>
</html>
