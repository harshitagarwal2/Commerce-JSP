<html>
    <head>
                        <title>DATA  SHOW REQUEST</title>
                    </head>
                    <body bgcolor='cornsilk'>
                    <center>
                        <font color='red' size='15'>Select Following Details Sort Data</font>
                        <form action='update2.jsp' method='post'>
                      <table>
                            <tr> <td>NAME</td>       <td><input type='text' name='NAME'></td> </tr>\
                            <tr> <td>Gender</td>        <td> <input type='radio' name='GENDER' value='M'> Male <br>
                                                             <input type='radio' name='GENDER' value='F'> Female <br></td></tr>
                            <tr> <td>Membership</td>    <td> <select name='MTYPE'> 
                                                           <option> Select </option>
                                                            <option value='1'> Platinum </option>
                                                             <option value='2'> Gold </option>
                                                            <option value='3'> Silver </option> </select> </td></tr> 
                         <tr> <td>  </td>               <td> <input type='submit' name='submit' value='show' > </td></tr>
                     </table>
                 </form>
               </center>
                    
                   </body>
                </html>