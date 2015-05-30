package edu.acc.j2ee;
//package controller;

import static edu.acc.j2ee.controllerServlet.currentCon;
import edu.acc.j2ee.Product;
import java.util.ArrayList;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// DataSource ds;
  //@Resource(name="jdbc/onlineshopping")

public class DbBean {
   
     ResultSet rs = null;
     String url;
    Statement stmt=null;    
    
    
    
public  ArrayList getSearchResults(String keyword) throws ClassNotFoundException {
ArrayList products = new ArrayList();
try {
    //connect to DB 
         currentCon = ConnectionManager();		
         stmt = currentCon.createStatement();

String sql = "SELECT ProductId, Name, Description, Price FROM Products"
+
" WHERE Name LIKE '%" + keyword.trim() + "%'" +
" OR Description LIKE '%" + keyword.trim() + "%'";
ResultSet rs = stmt.executeQuery(sql);
while (rs.next()) {
Product product = new Product();
product.setId(rs.getInt("id"));
product.setName(rs.getString("name"));
product.setDescription(rs.getString("description"));
product.setPrice(rs.getBigDecimal("price"));
products.add(product);
}
rs.close();
stmt.close();
currentCon.close();
}
catch (SQLException e) {}
return products;
}



private  Connection ConnectionManager() throws ClassNotFoundException {      
        
    url = "jdbc:mysql://localhost:3306/onlineshopping"; 
//loading drivers for mysql
  
try { 
//creating connection with the database 
     Class.forName("com.mysql.jdbc.Driver");
    currentCon = DriverManager.getConnection(url,"root","javauser"); 
 } catch (SQLException ex)
 { 
ex.printStackTrace(); 
}
 return currentCon;
 } 
    }

 


        




    
