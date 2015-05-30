<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@include file="/WEB-INF/jspf/header.jspf" %>


<body>
    <h2 class="flash">${flash}</h2>
          <%
              
                    //Get parameters from the request
                    String emailAddress = request.getParameter("emailAddress");
                    String firstName= request.getParameter("firstName");
                    String lastName =request.getParameter("lastName");                 
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    String password2 =request.getParameter("password2");
                    
                    if (username.length() < 4 || username.length() > 10
                       || password.length() < 4 || password.length() > 10) {
                       request.setAttribute("flash", "Username must be between 4 and 10 characters.");
                       response.sendRedirect("signupForm");
                                }
                    if (!password.equals(password2)) {
                        request.setAttribute("flash", "Passwords don't match.");
                       response.sendRedirect("signupForm");
                    }

                    if (username == null) {
                      response.sendRedirect("signupForm");
                    } 
                   
                   
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","javauser");
                    Statement st = con.createStatement();
                    int i = st.executeUpdate("insert into customer(email, FirstName, LastName, Password, UserName) "
                            + "values ('" + emailAddress +"','"+ firstName + "','" + lastName + "','" + password + "','" + username + "')");
                        if (i > 0) {
        
                            response.sendRedirect("welcome");
                            } else {
                            response.sendRedirect("login");
                        }
                           
         %>
           <h1>Thanks for joining our email list</h1>>
           <p>Here is the information that you entered:</p>
            <table cellspacing="5" cellpadding="5" border="1">
                  <tr>
                     <td align="right">User name:</td>
                     <td><%= username %></td>                     
                  </tr> 
                  <tr>
                     <td align="right">Password:</td>
                     <td><%=  password %></td>                     
                  </tr>                   
            </table>
      <p>To enter another email address, click on the back button <br>
      in your browser or the return button shown  below.</p>
    <form action="signupForm">
     <input type="submit" value="Return">
    </form>
 </body>
</html>
     </body>
</html>
