/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author rana
 */
public class Employee {
    
   
    public static boolean setEmployeeData(String JobTitle ,String EmpFName,String EmpLName,int id, int phone_Num, int salary, int work_hours){
        String EmployeeFName=EmpFName;
        String EmployeeLName=EmpLName;
        String JobDescription=JobTitle;
        int ID= id;
        int phoneNum= phone_Num;
        int Salary= salary;
        int WorkHours=work_hours;
        int k;
        try{
            Connection conn= null;
            DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "Solwan@Shokry2299");
            if (conn!=null)
            {
                System.out.println("DataBase connected Successfully!!");
            }
            PreparedStatement stmt=conn.prepareStatement("INSERT INTO employee values(?,?,?,?,?,?,?)");  
            stmt.setInt(1,ID);
            stmt.setString(2,EmployeeFName);
            stmt.setString(3,EmployeeLName);
            stmt.setInt(4,Salary); 
            stmt.setString(5,JobDescription);
            stmt.setInt(6,WorkHours);
            stmt.setInt(7,phoneNum);
            k =stmt.executeUpdate();
            if(k !=0){
                return true;
            }
            else 
            {
                return false;
            }
        }
            catch(SQLException err){
            System.out.println(err.getMessage());
            System.out.println("DataBase NOT connected");   
          }
     return false;
    }
}
    

