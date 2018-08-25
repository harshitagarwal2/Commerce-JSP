<jsp:useBean class="jsp1.userdetails" id="r" scope="request"></jsp:useBean>
<jsp:useBean class="jsp1.registrationdb" id="db" scope="request"></jsp:useBean>
<jsp:setProperty name="db" property="*" ></jsp:setProperty>
<html>
    <head>
    <title>Registration form</title>
    </head>
    <%  int id =r.saveregistration( db );
        if (id != 0) {
%>
    <body>
        <center>      
            <h1> Your message has been saved in data </h1> <br> <br>
            <a href="menu.jsp">home</a>
        </center>  
        <%
          }
    else
        {
%>
       <h1> Your message not has been saved in data </h1>
        <a href="menu.jsp">home</a>
       <%   }  %>
</body>
</html>



                         