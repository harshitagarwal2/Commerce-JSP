<jsp:useBean class="jsp1.userdetails" id="r" scope="request"></jsp:useBean>
<jsp:useBean class="jsp1.reportdb" id="db" scope="request"></jsp:useBean>
<%@page import="jsp1.*" %>    
<jsp:setProperty name="db" property="*" ></jsp:setProperty>
<%@page import="java.util.*"%>
<html>
                      <head>
                           <title>DataBase Records</title>
                       </head>
                      <body bgcolor='cornsilk'>
                      <center>
                          <font color='red' size='10'>RECORD REPORT</font> <br> <br>
                           <table border='1'>
                              <tr> <td>ID</td> <td>NAME</td> <td>GENDER</td> <td>AGE</td> <td>ADDRESS</td> <td>MTYPE</td> <td>SALARY</td> <td>USERNAME</td> <td>PASSWORD</td> </tr>
           
<% 
    TreeSet data = r.getreport(db);
     Iterator i = data.iterator();
    while(i.hasNext())
    {
     Customer c =  (Customer) i.next();
     int id = c.id ;
     int age = c.age;
     int sal = c.salary;
     int mtype = c.mtype;
     String name = c.name;
     String gender = c.gender;
     String addr = c.addr;
     String user = c.username;
     String pass = c.password;
%>
<tr> <td><%=id%></td> <td><%=name%></td> <td><%=gender%></td> <td><%= age %></td> <td><%= addr %></td> <td><%= mtype %></td> <td><%= sal %></td> <td><%= user %></td> <td><%= pass %></td> </tr>
<%
    }
%>
                 
                           </table>
    <center><br><br><a href='menu.jsp'>home</a><br><br></center>
                      </center>  
                   </body>
</html>