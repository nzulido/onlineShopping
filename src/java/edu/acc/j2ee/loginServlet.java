/*
 *This LoginServlet is intended to handle the Business logic associated with the request.
 */
package edu.acc.j2ee;

import java.io.IOException; 
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession; 
/** * Servlet implementation class LoginServlet */ 

public class loginServlet extends HttpServlet { 
    
protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, java.io.IOException {
                response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		    
        try {	
            
           CustomerBean user = new CustomerBean(); 
           user.setUserName(request.getParameter("userName"));
           user.setPassword(request.getParameter("Password")); 
           user = CustomerDAO.login(user);
               if (user.isValid()) { 
                   
                    HttpSession session = request.getSession(true);                    
                    session.setAttribute("currentSessionUser",user);
                    response.sendRedirect("../../userLogged"); //login page
//                  //logged-in page 
               } 
                  else response.sendRedirect("../../invalidLogin"); //error page
//           //error page 
        } catch (Throwable theException)
        {
            System.out.println(theException);
        } 
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     //   doGet(request, response);
    }

    }





