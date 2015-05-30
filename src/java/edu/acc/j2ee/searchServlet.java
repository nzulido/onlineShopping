package edu.acc.j2ee;

import java.lang.Object;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class searchServlet extends HttpServlet {

    
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //doPost(request, response);
    }    
 
public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        //Connection conn;
       //  String url = "jdbc:mysql://localhost:3306/onlineShopping"; 

        ArrayList productlist = new ArrayList();
       
        try {
            //Load the JDBC driver. jdbc:mysql://localhost:3306/onlineshopping
            Class.forName("com.mysql.jdbc.Driver");
 
            // Establish the connection to the database.
            String url = "jdbc:mysql://localhost:3306/onlineShopping";
            Connection conn = DriverManager.getConnection(url, "root", "javauser");
            
            Statement st = conn.createStatement();
            String keyword = request.getParameter("keyword");
          //  String images = request.getParameter("images");

            ResultSet srs = st.executeQuery("SELECT * FROM product "
                    + "where name LIKE '%" + keyword.trim() + "%' ");
                   
            
            // Fetch record from database first and store in ArrayList            
            while (srs.next()) {
                Product product = new Product();
                
                product.setName(srs.getString("name"));
                product.setPrice(srs.getBigDecimal("price"));
                product.setDescription(srs.getString("description")); 
                product.setRating(srs.getString("rating"));
                product.setId(1);
                productlist.add(product);
             
      
//        // set the List of product as request attribute
            request.setAttribute("resultList", productlist); 
                    // forward the request to the JSP page
                    RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/view/data.jsp");
                    dispatcher.forward(request,response);
//                   srs.close();
//                    st.close();
//          }          conn.close();                   
       }
        } catch (Exception e) {
            throw new ServletException("Something failed at SQL/DB level.", e);  
            
             }
                 RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/view/noResult.jsp");
                          dispatcher.forward(request,response);
    }
 
 @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
