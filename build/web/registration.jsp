<html>
    <head>
        <title>New Registration</title>
    </head>
    <body bgcolor='Antiquewhite'>
    <center>
        <font color="blue" size="5">Welcome to New Registration Form</font> <br>
        <font color="red" size="4"> Please Enter your details</font> <br>
        <hr>
        <form action="reg.jsp" method="post">
        <table>
            <tr> <td>Name</td>          <td> <input type="text" name="NAME"> </td> </tr>
            <tr> <td>Address</td>       <td> <textarea rows="4" cols="50" name="ADDRESS"> </textarea> </td></tr>
            <tr> <td>Gender</td>        <td> <input type="radio" name="GENDER" value="M"> Male <br>
                                             <input type="radio" name="GENDER" value="F"> Female <br></td></tr>
            <tr> <td>Membership</td>    <td> <select name="MTYPE"> 
                                             <option> Select </option>
                                             <option value="1"> Platinum </option>
                                             <option value="2"> Gold </option>
                                             <option value="3"> Silver </option> </select> </td></tr> 
            <tr> <td>Age</td>               <td> <input type="number" name="AGE" > </td></tr>
           
            <tr> <td>salary</td>               <td> <input type="number" name="SALARY" > </td></tr>
            <tr> <td>Username</td>      <td> <input type="text" name="USERNAME"> </td></tr>
            <tr> <td>Password</td>      <td> <input type="password" name="PASSWORD"></td></tr>
  <tr> <td></td>      <td> <input type='submit' name='SUBMIT' value='save' > </td></tr>

        </table>
        </form>
    </center>
</body>

</html>
