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
public class SQLconnect {
    
    public static void main (String[] args){
        
        try
        {   
            Connection conn= null;
            DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root","root", "root");
            
            if (conn!=null)
            {
                System.out.println("DataBase connected Successfully!!");
            }
        }
        catch(SQLException e){
            System.out.println("DataBase NOT connected");
            System.out.println(e.getMessage());
        }
    }
}
