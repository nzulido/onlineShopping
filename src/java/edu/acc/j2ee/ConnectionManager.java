
package edu.acc.j2ee;

/**
 *
 * @author nzulido
 */
//"ConnectionManager" to get a connection with the DB.
import java.sql.*; 
import java.util.*; 

public class ConnectionManager { 
static Connection con;
 static String url; 
// String url = "jdbc:mysql://localhost:3306/onlineshopping";
public static Connection getConnection() throws ClassNotFoundException { 
    try{
//loading drivers for mysql
   Class.forName("com.mysql.jdbc.Driver");    
//creating connection with the database 
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","javauser"); 
System.out.println ("Database connection established"); 
 } catch (SQLException ex)
 { 
ex.printStackTrace(); 
}
  
return con;
 } 
}