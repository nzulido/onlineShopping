/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.acc.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nzulido
 */
public class Search extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Search</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Search at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
 
 public void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException{
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
System.out.println("connecting to the database");
Connection conn =  null;
String url =  "jdbc:mysql://localhost:3306/";
String dbName  =  "onlineShopping";
String driver =  "com.mysql.jdbc.Driver";
String userName = "root";
String password = "javauser";
Statement st ; 

try{
Class.forName(driver).newInstance();
conn = DriverManager.getConnection(url+dbName,userName, password);
System.out.println("connected to the database");
String keyword = request.getParameter("keyword");

ArrayList al = null;
ArrayList keyword_list = new ArrayList();
String query = "select * from product where name = '  "  + keyword + " '  ";
System.out.println("query " + query );
st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
 while(rs.next()){
  al  = new ArrayList();  
    out.println(rs.getString(1));
   out.println(rs.getString(2));
   out.println(rs.getString(3));
   out.println(rs.getString(4));
    al.add(rs.getString(1));
    al.add(rs.getString(2));
     al.add(rs.getString(3));
      al.add(rs.getString(4));
     System.out.println("al :: " + al);
                keyword_list.add(al);
            } 
 

  request.setAttribute("keywordList", keyword_list);  
  RequestDispatcher dispatcher = 
   getServletContext().getRequestDispatcher("/searchResults.jsp");
  dispatcher.forward(request,response);
  conn.close();
  System.out.println("Disconnected from database");
  } catch (Exception e) {
  e.printStackTrace();
  }
  

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
