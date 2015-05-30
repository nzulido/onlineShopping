/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.acc.j2ee;



import java.lang.Object;
import java.io.IOException;
import java.io.InputStream;
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
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
/**
 *
 * @author nzulido
 */
public class imageServlet extends HttpServlet {

   
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
       try {
           
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","javauser");
           Statement st=con.createStatement();
           
           int id = Integer.parseInt(request.getParameter("id"));
           String strQuery = "SELECT image from product where id="+id;                          
           ResultSet rs = st.executeQuery(strQuery);
           rs = st.executeQuery(strQuery);
           
            while(rs.next()){
              byte[] content = rs.getBytes("image");
              response.setContentType("image/jpeg");
            
              ServletOutputStream out = response.getOutputStream();            
              response.setContentLength(content.length);
              response.getOutputStream().write(content);
              response.getOutputStream().close();
        
            }
       }       
        catch (Exception e){
       e.printStackTrace();
  }
    
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
