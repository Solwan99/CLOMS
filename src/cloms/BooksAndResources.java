package cloms;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
        
/**
 *
 * @author sarah
 */
public class BooksAndResources {
    private int BR_NUMBER ;
    private String  BR_Name  ;
    private String AuthorName ;
    private int price ;
    private String Genre ;
    private int Availability ;
    private int updatedBy ;
    private int MembershipNum ;
    private int VisitorID ;
    
    public boolean setBookInfo (int BR_NUMBER, String  BR_Name , String AuthorName , int price ,int Availability , int updatedBy) throws SQLException
    {
        this.BR_NUMBER = BR_NUMBER ;
        this. BR_Name  = BR_Name;
        this.AuthorName = AuthorName ;
        this.price = price ;
    
        this.Availability = Availability ;
        this.updatedBy = updatedBy ;
        int k =0;
        try {
             Connection conn= null;
                //DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "root");
                if (conn!=null)
                {
                    System.out.println("DataBase connected Successfully!!");
                }
              Statement st = conn.createStatement();
              String SQL1 = "INSERT INTO BooksAndResources VALUES (?,?,?, ? ,? ,? )" ;
              PreparedStatement prst = conn.prepareStatement(SQL1);
              prst.setInt(1,this.BR_NUMBER);
              prst.setString(2,this.BR_Name);
              prst.setString(3,this.AuthorName);
              prst.setInt(4,this.price);
              prst.setInt(5,this.Availability);
              prst.setInt(6,this.updatedBy);
               k = prst.executeUpdate();
            if(k !=0){
                return true;
            }
            else 
            {
                return false;
            }
        }
        catch (SQLException err)
        { 
            System.out.println(err.getMessage());
        }
        return false;
    }
    
    public void lending (int BookNumber, int EmployeeID , int memberID)throws SQLException
    { 
        
        int available =  getBooksAvailability (BookNumber) ;
         if(available>0)
         { available -- ;
          
          try {
              Connection conn= null;
            DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloms","root", "root");
            if (conn!=null)
            {
                System.out.println("DataBase connected Successfully!!");
            }
            
              Statement st = conn.createStatement();
              String sql = " UPDATE BooksAndResources SET Availability = ? WHERE BR_NUMBER = ? ";
               PreparedStatement prst = conn.prepareStatement(sql);
                prst.setInt(1,BookNumber);
       
                prst.setInt(5,available);
                
                
                 Date currentdate = new Date();  
              SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
              String date = formatter.format(currentdate); 
                
                Statement stm = con.createStatement();
                String SQL = "INSERT INTO LENDING VALUES(?,?,?,?)";
                prst.setInt(1,EmployeeID);
                prst.setInt(2,BookNumber);
                prst.setInt(3,memberID);
                 prst.setString(4,date);
                 
                 
            }
          catch (SQLException err)
          {
            System.out.println(err.getMessage());  
          }
         }
         else { System.out.println("there is no available copies of the required book") ;}
              
    }
     
    public int getBooksAvailability (int bookID ) throws SQLException
     {
          int available=0;
          String host = "jdbc:derby://localhost:1527/clmosBooks" ;
        String uName = "sarah";
        String uPass = "root";
         try {
               Connection con = DriverManager.getConnection(host,uName,uPass);
              Statement st = con.createStatement();
              String sql = "SELECT Availability FROM BooksAndResources WHERE bookID =  BR_NUMBER" ;
              ResultSet rs = st.executeQuery(sql) ;
              available = rs.getInt(6);
               
         }
         catch (SQLException err)
         { 
             System.out.println(err.getMessage());
         }
        
        return available  ;
        
     }
    public void searchEBook(String name , String author)throws SQLException
    {
        String host = "jdbc:derby://localhost:1527/clmosBooks" ;
        String uName = "sarah";
        String uPass = "root";
         try {
               Connection con = DriverManager.getConnection(host,uName,uPass);
              Statement st = con.createStatement();
              String sql = "SELECT * FROM BooksAndResources WHERE BR_Name =name AND AuthorName= author";
               ResultSet rs = st.executeQuery(sql) ;
               while(rs.next())
               {
                   System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" "+ rs.getString(3)+" " + rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getInt(7));
               }
            }
         catch (SQLException err)
         { 
             System.out.println(err.getMessage());
         }
   }
    
   public void sendRecommendation()throws SQLException
   {
       String host = "jdbc:derby://localhost:1527/clmosBooks" ;
        String uName = "sarah";
        String uPass = "root";
         try {
               Connection con = DriverManager.getConnection(host,uName,uPass);
              Statement st = con.createStatement();
              String sql = "SELECT EMAIL , BR_Name,BookAuthor FROM MEMBER , LENDING , BooksAndResources WHERE MemberShip=MEMBERSHIPNUMBER AND  BR_NUMBER = BookNumber" ;
              ResultSet rs = st.executeQuery(sql) ;
              while(rs.next())
               {
                   System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" "+ rs.getString(3));
               }
            }
         catch (SQLException err)
         { 
             System.out.println(err.getMessage());
         }
   }
   
 }

