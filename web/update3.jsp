<%
    String id =request.getParameter("ID");
    int id1 = Integer.parseInt(id);
           userdetails r = new userdetails();
        updatecust c = r.update1(id1);
        String name = c.NAME;
        String addr = c.ADDRESS;
        String gen = c.GENDER;
        String user = c.USERNAME;
        String pass = c.PASSWORD;
        int age = c.AGE;
        int mtype = c.mtype;
        int sal = c.salary;
%>
<%@page import="jsp1.*" %>
    


<html>
    <head>
        <title>New Registration</title>
    </head>
    <body bgcolor='Antiquewhite'>
    <center>
       
        
        <font color="blue" size="5">Welcome to New Registration Form</font> <br>
        <font color="red" size="4"> Please Enter your details</font> <br>
        <hr>
        <form action="update4.jsp" method="post">
             <input type="hidden" name="NID" value="<%= id1 %>" />
        <table>
            <tr> <td>Name</td>          <td> <input type="text" name="NAME" value="<%= name %>"> </td> </tr>
            <tr> <td>Address</td>       <td> <textarea rows="4" cols="50" name="ADDRESS"><%= addr %> </textarea> </td></tr>
            <tr> <td>Gender</td>        <td> <input type="radio" name="GENDER" value="M"> Male <br>
                                             <input type="radio" name="GENDER" value="F"> Female <br></td></tr>
            <tr> <td>Membership</td>    <td> <select name="MTYPE1"> 
                                             <option> Select </option>
                                             <option value="1"> Platinum </option>
                                             <option value="2"> Gold </option>
                                             <option value="3"> Silver </option> </select> </td></tr> 
            <tr> <td>Age</td>               <td> <input type="number" name="AGE1" value="<%= age %>" > </td></tr>
           
            <tr> <td>salary</td>               <td> <input type="number" name="SAL" value="<%= sal %>" > </td></tr>
            <tr> <td>Username</td>      <td> <input type="text" name="USERNAME" value="<%= user %>" > </td></tr>
            <tr> <td>Password</td>      <td> <input type="password" name="PASSWORD" value="<%= pass %>"></td></tr>
  <tr> <td></td>      <td> <input type='submit' name='SUBMIT' value='save' > </td></tr>

        </table>
        </form>
    </center>
</body>

</html>
