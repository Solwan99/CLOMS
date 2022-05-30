/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author solwa
 */
public class InternalComputers {
    
private static int NumofComp=5;
    private int memberid;
    private boolean state;
    private int availableCount=5;
    private int sessionDuration;
    public String ipAddress;
    

    public boolean setInternalcomp(boolean state, int sessionDuration, String ipAddress,int memberid)throws SQLException  {

        this.state = state;
        this.sessionDuration = sessionDuration;
        this.ipAddress = ipAddress;
        this.memberid=memberid;
        int i=0;
          try{
                Connection conn= null;
                //DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "root");
                if (conn!=null)
                {
                    System.out.println("DataBase connected Successfully!!");
                }

                Statement stmt = conn.createStatement();
                String SQL = "INSERT INTO internalcomputers  ( STATE,SESSIONDURATION,IPADDRESS, USERID) VALUES (?,?,?,?)";
                PreparedStatement preparedStmt = conn.prepareStatement(SQL);
                preparedStmt.setBoolean(1,this.state );
                preparedStmt.setInt(2,this.sessionDuration );
                preparedStmt.setString(3,this.ipAddress );
                preparedStmt.setInt(4,this.memberid );
                i= preparedStmt.executeUpdate();
                if(i>0){
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
   

   
    
    public boolean getComputersAvailabilty() throws SQLException{
        
           try{
            Connection conn= null;
            DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root","root", "root");
            if (conn!=null)
            {
                System.out.println("DataBase connected Successfully!!");
            }

            Statement stmt = conn.createStatement();
            String SQL;
            SQL = "SELECT * FROM internalcomputers where STATE = true ";
            PreparedStatement preparedStmt = conn.prepareStatement(SQL);
     
            ResultSet R = stmt.executeQuery( SQL );
            
            if (availableCount>0){
            while(R.next()){
                System.out.println("Available computers ip addresses " + R.getString("IPADDRESS"));
                
            }
            return true;
            }  
            else {
                System.out.println("No available computers" );
                return false;
            }
           
            
        }
        catch (SQLException err){  
            System.out.println( err.getMessage( ));
        }
    return false;
        
 
    }
    
    /**
     *
     * @return
     */

    /**
     *   
     * @throws SQLException
     */
     public void InternalComputers() throws SQLException
            
    {
        int a = NumofComp-availableCount;
           
         System.out.println("Number of used computers " + a);
    }
    
    public boolean setsession(int memberid, int sessionDuration,String IPadress)throws SQLException    {
        this.state=false;
    this.memberid=memberid;
    this.sessionDuration=sessionDuration;
    this.ipAddress=IPadress;
    try{
        Connection conn= null;
       // DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "root");
        int i=0;
        if (conn!=null)
        {
            System.out.println("DataBase connected Successfully!!");
        }

            Statement stmt = conn.createStatement();
            String SQL =  " UPDATE  internalcomputers SET STATE= ? ,SESSIONDURATION=? , USERID=? WHERE  IPADDRESS=? ";
            
            availableCount--;
            PreparedStatement preparedStmt = conn.prepareStatement(SQL);
            preparedStmt.setBoolean(1,this.state);
            preparedStmt.setInt(2,this.sessionDuration );
            preparedStmt.setString(3,ipAddress);
            preparedStmt.setInt(4, this.memberid);
           
            i= preparedStmt.executeUpdate();
            if(i>0){
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
    public boolean freeComputer (String IPadress) throws SQLException{
        this.ipAddress= IPadress;
        this.state=false;
        try{
             prst

            Statement stmt = conn.createStatement();
            String SQL =  " UPDATE internalcomputers SET 'STATE' = ? WHERE 'IPADDRESS'=? ";
            availableCount++;
            PreparedStatement preparedStmt = conn.prepareStatement(SQL);
            preparedStmt.setBoolean(1, this.state);
            preparedStmt.setString(2, this.ipAddress);
            i= preparedStmt.executeUpdate();
            if(i>0){
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
    
} 

