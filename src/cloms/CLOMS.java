
package cloms;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CLOMS {

    public static void main(String[] args) {
        
        
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");// or may be it is "org.apache.derby.jdbc.EmbeddedDriver"? Not sure. Check the correct name and put it here.
        }
        catch(ClassNotFoundException e)
        {
            //handle exception
        }

        String dbName = "IS2560";
        String driver = " sun.jdbc.odbc.JdbcOdbcDriver";
        String userName = "IS2560";
        String password = "IS2560";
        try {
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(“jdbc:odbc:”+ dbName,userName,password);
            System.out.println("Connected to the database");
            //You can add some functions here
            conn.close();
        } 
        catch (Exception se)
        {
            System.out.println(“Connect failed !”);
        }
    }
    
}
