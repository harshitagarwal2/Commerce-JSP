package jsp1;
import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class moc 
{
    public static Connection goc() throws ClassNotFoundException, SQLException  {
            Connection conn;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            conn = DriverManager.getConnection(url,"harshit","h");
         return conn;
            }
}
    
