<% 
 int id = Integer.parseInt(request.getParameter("NID"));
            String name = request.getParameter("NAME");
            String addr = request.getParameter("ADDRESS");
            String gen =  request.getParameter("GENDER");
            int age = Integer.parseInt(request.getParameter("AGE1"));
            int mtype = Integer.parseInt(request.getParameter("MTYPE1"));
            int sal = Integer.parseInt(request.getParameter("SAL"));
            String user = request.getParameter("USERNAME");
            String pass = request.getParameter("PASSWORD");
            userdetails r = new userdetails();
            int id1 = r.update2(id, name, gen, age, addr, mtype, sal, user, pass);
%>

<%@page import="jsp1.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
if (id == 0) {
        %>
       
       <title>Update ERROR</title>
    </head>
    <body bgcolor='antiquewhite'>
    <center>
        <font size="6" >Please contact the admin for further help</font>
        <a href="menu.jsp">MENU PAGE</a>
        <% }
else  {
         %>
        <font size="6" color='navy'>CONGRATS,Your Details Are Successfully updated in the DATABASE</font>
         
        <a href="menu.jsp" >MENU PAGE</a>
        
         <% } %>
    </center>
    
</body>
</html>
