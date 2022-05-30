package cloms;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.lang.Exception;
import java.lang.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Visitors {

    protected String Name;
    protected int ID;
    protected int phoneNumber;
    protected String userName;
    protected String password;
    public String address;
    protected int EMPID ;      

    public  boolean setVisitorData(String name, int ID, int phoneNumber, String address, String userName ,String password, int empID)throws SQLException { 
        this.ID = ID;
        this.Name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.userName=userName;
        this.password=password;
        this.EMPID=empID;
          try{
           Connection conn= null;
            DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "Solwan@Shokry2299");
            if (conn!=null)
            {
                System.out.println("DataBase connected Successfully!!");
            }
            Statement stmt = conn.createStatement();
                String SQL = "INSERT INTO visitor(V_ID, V_NAME, ADDRESS, PHONENUMBER,USERNAME, PASSWORD, E_ID) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = conn.prepareStatement(SQL);
            preparedStmt.setInt(1, this.ID);
            preparedStmt.setString(2,this.Name );
            preparedStmt.setString(3,this.address );
            preparedStmt.setInt(4,this.phoneNumber );
            preparedStmt.setString(5,this.userName );
            preparedStmt.setString(6,this.password );
            preparedStmt.setInt(7, this.EMPID);
            
            int rs=preparedStmt.executeUpdate();
            if(rs>0){
                return true;
            }
            else{
                return false;
            }
        }
        catch (SQLException err){  
            System.out.println( err.getMessage( ));
        }
        return false;
    }

    public void printVisitorData() throws SQLException{

          try{
            Connection conn= null;
            DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "Solwan@Shokry2299");
            if (conn!=null)
            {
                System.out.println("DataBase connected Successfully!!");
            }
            Statement stmt = conn.createStatement();
            String SQL = "SELECT * FROM visitor ";
            ResultSet rs = stmt.executeQuery( SQL );
            while(rs.next())
            {
                System.out.println("The stored data of " + rs.getString("V_NAME") + "are: ");
                System.out.println("- ID: " + rs.getInt("V_ID"));
                System.out.println("- phone number: " + rs.getInt("PHONENUMBER"));
                System.out.println("- address: " + rs.getString("ADDRESS"));
                System.out.println("- userName: " + rs.getString("USERNAME"));
                System.out.println("- password: " + rs.getString("PASSWORD"));
                System.out.println("- phone number: " + rs.getInt("E_ID"));
            }
        }
        catch (SQLException err){  
            System.out.println( err.getMessage( ));
        }
    }

    public void login(String userName, String password) throws SQLException{
        try
        {
            Connection conn= null;
            DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "Solwan@Shokry2299");
            if (conn!=null)
            {
                System.out.println("DataBase connected Successfully!!");
            }

            Statement stmt = conn.createStatement();
            String SQL = "SELECT USERNAME, PASSWORD FROM visitor WHERE PASSWORD=V_ID";
            ResultSet rs = stmt.executeQuery( SQL );
            boolean flag=false;
            while(rs.next()&& (flag==false) )
            {
                if((rs.getString("PASSWORD").equals(password)))
                {
                    this.userName= rs.getString("USERNAME");
                    this.password= rs.getString("PASSWORD");
                    flag=true;
                }
            }
            if (flag==true) 
            {
                System.out.println("Successful Login!\n----");
            } 
            else 
            {
                System.out.println("Unsuccessful Login\n----");
            }
        }
        catch (SQLException err){  
            System.out.println( err.getMessage( ));
        }


        
        
    }

   // public boolean register() throws SQLException {

     //   boolean registered=this.setVisitorData(Name, ID, phoneNumber, address, userName, password, EMPID);
        
     //   return registered;
    //}

}
