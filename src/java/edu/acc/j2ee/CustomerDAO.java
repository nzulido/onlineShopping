/*
 *The DAO, as said before, contains methods needed to communicate with the data source. 
 *In our example, the only needed method is the login method that checks if the username
 *and password inputted by the user are valid or not.The DAO uses a class named
 */
package edu.acc.j2ee;


import static edu.acc.j2ee.ConnectionManager.con;
import javax.resource.spi.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.*;
import java.util.*;
import java.sql.*; 


public class CustomerDAO { 
static Connection currentCon = null; 
static ResultSet rs = null;
static Connection con;
static String url; 

public static CustomerBean login(CustomerBean bean) {
 //preparing some objects for connection
   Statement stmt = null; 
   String username = bean.getUsername();
   String password = bean.getPassword(); 
   String searchQuery = "select * from customer where username='" + username 
           + "' AND password='" + password + "'";
   // "System.out.println" prints in the console; 
   //Normally used to trace the process 
   System.out.println("Your user name is " + username); 
   System.out.println("Your password is " + password); 
   System.out.println("Query: "+searchQuery); 
      try { 
            //connect to DB 
            currentCon = ConnectionManager();
            stmt=currentCon.createStatement(); 
            rs = stmt.executeQuery(searchQuery);
            boolean more = rs.next();
             // if user does not exist set the isValid variable to false
             if (!more) {
             System.out.println("Sorry, you are not a registered user! Please sign up first"); 
            bean.setValid(false); 
            } 
            //if user exists set the isValid variable to true 
            else if (more) { 
            String firstName = rs.getString("FirstName"); 
            String lastName = rs.getString("LastName"); 
            System.out.println("Welcome " + firstName);
            bean.setFirstName(firstName);
            bean.setLastName(lastName); 
            bean.setValid(true); 
            }
         } catch (Exception ex) {
           System.out.println("Log In failed: An Exception has occurred! " + ex);
           } //some exception handling 
           finally { 
              if (rs != null)	{ 
                try { 
                rs.close(); 
                } catch (Exception e) {
                } 
                rs = null; 
                } 
                if (stmt != null) {
                 try { 
                stmt.close(); 
                } catch (Exception e) {
                } 
                stmt = null; 
                }
                 if (currentCon != null) {
                 try {
                 currentCon.close();
                 } catch (Exception e) { 
                } 
                currentCon = null; 
                }
                 } 
                        return bean; 
}

private static Connection ConnectionManager() throws ClassNotFoundException {      
        
    url = "jdbc:mysql://localhost:3306/onlineshopping"; 
//loading drivers for mysql
  
    try { 
        //creating connection with the database 
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(url,"root","javauser"); 
         } catch (SQLException ex)
         { 
           ex.printStackTrace(); 
        }
              return con;
        } 
    }
