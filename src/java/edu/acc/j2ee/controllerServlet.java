 package edu.acc.j2ee;


import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import static edu.acc.j2ee.CustomerDAO.currentCon;
import static edu.acc.j2ee.CustomerDAO.url;
import entities.Category;
import entities.Product;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.ejb.EJB;
import javax.servlet.ServletConfig;
//import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import edu.acc.j2ee.DbBean;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;


/**
 *
 * @author nzulido
 */
public class controllerServlet extends HttpServlet {
    static Connection currentCon = null; 
    static ResultSet rs = null;
    static String url;
    Statement stmt=null;    
   
      

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
       
        String userPath = request.getServletPath();  
         
        // if category page is requested
        if (userPath.equals("/category")) {
            // TODO: Implement category request
            
        }

        // use RequestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    }
 }

 


        




    
