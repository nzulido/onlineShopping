<%@ page language="java" import="java.sql.*"%>   
<%@include file="/WEB-INF/jspf/header.jspf"  %>

<body>
   <h2 class="flash">${flash}</h2>

<div class="bs-example1">    
   
        <%
            String name = request.getParameter("userName");
            String pass = request.getParameter("Password");
            
            try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","javauser");
                     Statement st = con.createStatement();
                     ResultSet rs = st.executeQuery("select * from customer");
                     int x = 0;
                     while (rs.next()) {
                         if ((rs.getString("userName").equals(name)) && rs.getString("Password").equals(pass)) {
                             String userType = rs.getString("utype");
                             if (userType.equals("Admin")) {
                                 x = 1;
                                 break;
                             } else {
                                 x = 2;
                                 break;
                             }
                         }
                     }
                     if (x == 1) {
                         response.sendRedirect("admin");
                     } else if (x == 2) {
                         response.sendRedirect("commentForm");
                     } else {
                         out.println("Either you enter Invalid UserName or Password! Please Try Again");
                         %>
                            <jsp:include page="login.jsp" />
                            <%}

                          } catch (Exception e) {
                              out.println(e);
                          }

                          session.setAttribute("userName", name);
                          %>
                  </div>
        
        
        <p>Copyright 2015@LaBellaFashion.com</p>      
       </body>
</html>                          
