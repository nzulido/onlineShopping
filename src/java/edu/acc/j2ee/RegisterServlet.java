/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.acc.j2ee;

import java.lang.String;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.acc.j2ee.emailValidator;

/**
 *
 * @author nzulido
 */
public class RegisterServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              
             response.setContentType("text/html;charset=UTF-8");
             PrintWriter out = response.getWriter();
                    //Get parameters from the request
            String emailAddress = request.getParameter("emailAddress");
            String firstName= request.getParameter("firstName");
            String lastName =request.getParameter("lastName");                 
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String password2 =request.getParameter("password2");
            String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            
            if (username.length() < 4 || username.length() > 10
                       || password.length() < 4 || password.length() > 10) {
                       request.setAttribute("flash", "Username must be between 4 and 10 characters.");
                       response.sendRedirect("../notLogin");
                                }
                    if (!password.equals(password2)) {
                       request.setAttribute("flash", "Passwords don't match.");
                       response.sendRedirect("../invalidLogin");
                    }
            if (!(emailAddress.matches(EMAIL_PATTERN))){
                       request.setAttribute("flash", "Enter valid email format.");
                       response.sendRedirect("../invalidEmail");
                  
            }
            if(username.equalsIgnoreCase(username)){
                request.setAttribute("flash", "username is already taken");
                       response.sendRedirect("../userExist");
            }
                               
            try{
               Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","javauser");
                   // Statement st = con.createStatement();
                    PreparedStatement ps = con.prepareStatement("insert into customer(email, FirstName, LastName, Password, UserName) "
                            + "values (?,?,?,?,?)");
                                  
                   
                   ps.setString(1, emailAddress);
                   ps.setString(2, firstName);
                   ps.setString(3, lastName);
                   ps.setString(4, username);
                   ps.setString(5, password);
                   
                   int i= ps.executeUpdate();
                   if(i > 0){                      
                      response.sendRedirect("../welcome");
                   }
                   else{
                       
                      response.sendRedirect("../invalidLogin");
                   }
                   
            }catch (Exception e2) {
                
                System.out.println(e2);
            }
            
             // out.close();      
            }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
