
package cloms;

import java.time.*;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.lang.Exception;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Members extends Visitors {
    
    
    public boolean setMemberData(int memberNum,int MEMBERSHIP_NUM, String email, String interests, double payment,int E_ID)throws SQLException{
      
      
     
      int i;
      try{
           
                Connection conn= null;
                //DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "root");
                if (conn!=null)
                {
                    System.out.println("DataBase connected Successfully!!");
                }
            PreparedStatement stmt=conn.prepareStatement("INSERT INTO member  VALUES (?, ?, ?, ?, ?,?)");  
            stmt.setInt(1,memberNum);
             stmt.setInt(2,MEMBERSHIP_NUM);
            
            stmt.setString(3,interests); 
            stmt.setDouble(4, payment);
            stmt.setString(5,email);
            stmt.setDouble(6,E_ID);
    
            i=stmt.executeUpdate();
            if(i>0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException err){
            System.out.println(err.getMessage());
        }
      return false;
    }
    
    public void printMembersData()throws SQLException {
        
        
        try{
             Connection conn= null;
                //DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "root");
                if (conn!=null)
                {
                    System.out.println("DataBase connected Successfully!!");
                }
           
            Statement stmt = conn.createStatement();
            String SQL = "SELECT * FROM member, visitor where M_ID = V_ID  ";
            ResultSet rs = stmt.executeQuery( SQL );
            while(rs.next())
            {
                System.out.println("The stored data of "+rs.getString("NAME")+"are: ");
                System.out.println("- ID: "+rs.getInt("M_ID"));
                System.out.println("- phone number: "+rs.getInt("PHONENUMBER"));
                System.out.println("- address: "+rs.getString("ADDRESS"));
                System.out.println("- userName: "+rs.getString("USERNAME"));
                System.out.println("- password: "+rs.getString("PASSWORD"));
                System.out.println("- Membership number: "+rs.getInt("MEMBERSHIPNUM"));
                System.out.println("- email: "+rs.getString("EMAIL"));
         
                System.out.println("- Fields of interests: "+rs.getString("INTERESTS"));
                System.out.println("- Monthly payment: "+rs.getInt("MONTHLYPAYMENT"));
                
            }
        }
        catch (SQLException err)
        {  
            System.out.println( err.getMessage( ));
        }

       
    }
    public void sendExpDate(){
        
    }
    
    public void setComplains(String complains){
        
        
    }
    
    public void reserve(){
        
    }
}
