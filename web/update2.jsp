<jsp:useBean class="jsp1.userdetails" id="r" scope="request"></jsp:useBean>
<jsp:useBean class="jsp1.reportdb" id="db" scope="request"></jsp:useBean>
<jsp:setProperty name="db" property="*" ></jsp:setProperty>
<%@page import="java.util.*,jsp1.*"%>
<html>
                      <head>
                           <title>DataBase Records</title>
                       </head>
                      <body bgcolor='cornsilk'>
                      <center>
                          <font color='red' size='10'>RECORD REPORT</font> <br> <br>
                          <form action="update3.jsp" method="post">
                           <table border='1'>
                               <tr> <td></td> <td>ID</td> <td>NAME</td> <td>GENDER</td> <td>AGE</td> <td>ADDRESS</td> <td>MTYPE</td> <td>SALARY</td> <td>USERNAME</td> <td>PASSWORD</td> </tr>
 <% 
     TreeSet data = r.getreport(db) ;
      Iterator i = data.iterator() ;
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
<tr><td><input type='radio' name='ID' value="<%=id%>" maxlength=" 20 " </td><td><%=id%></td> <td><%=name%></td> <td><%=gender%></td> <td><%= age %></td> <td><%= addr %></td> <td><%= mtype %></td> <td><%= sal %></td> <td><%= user %></td> <td><%= pass %></td> </tr>
<%
    }
%>
                   </table> <br>
    <input type="submit" value="show">
    <center><br><br><a href='menu.jsp'>home</a><br><br></center>
                          </form>
                      </center>  
                   </body>
</html>