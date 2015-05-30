package edu.acc.j2ee;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author nzulido
 */
@WebServlet("/rating")
public class ratingServlet extends HttpServlet {
    private ConnectionManager  db = new ConnectionManager();

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

       @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession();
         session.getAttribute("userName");
       
        ArrayList productlist = new ArrayList();
        //out.println("<h1>Servlet ratingServlet at " + request.getParameter("rating") + "</h1>");
        try {
            //Load the JDBC driver. jdbc:mysql://localhost:3306/onlineshopping
            Class.forName("com.mysql.jdbc.Driver");
 
            // Establish the connection to the database.
            String url = "jdbc:mysql://localhost:3306/onlineshopping";
            Connection conn = DriverManager.getConnection(url, "root", "javauser");
            
            Statement st = conn.createStatement();
            String rating = request.getParameter("rating");

            ResultSet srs = st.executeQuery("insert into product rating values(rating) "
                    + "where id='?'");
                   
                   
            
            // Fetch record from database first and store in ArrayList            
            while (srs.next()) {
                
                String custRate = srs.getString("rating");
                Product product = new Product();
                product.setRating(rating);
                
//                product.setName(srs.getString("name"));
//                product.setPrice(srs.getBigDecimal("price"));
//                product.setDescription(srs.getString("description")); 
//                product.setRating(srs.getString("rating"));
//                product.setId(1);
//                productlist.add(product);
             
      
         
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
