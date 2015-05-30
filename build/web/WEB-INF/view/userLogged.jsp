 <%@ page language="java" 
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
         import="edu.acc.j2ee.CustomerBean"%>
<%@include file="/WEB-INF/jspf/header.jspf"  %>

 <body>
   <h2 class="flash">${flash}</h2>   
             <center>
                <%
                    CustomerBean currentUser = (CustomerBean)(session.getAttribute("currentSessionUser"));
                %>
                <h2>Welcome Back, <%= currentUser.getFirstName() + " " + currentUser.getLastName() %></h2>
             </center>
             
             <h3><strong>Please, leave a review about the store/products</strong></h3>                   
                  <h2 class="flash">${flash}</h2>
                  <form method="POST" action="index">
                            <textarea name="comments" rows="15" cols="50" placeholder="Hopefully, it is something positive" required></textarea><br><br>
                            <input type="hidden" name="action" value="post"/>
                            <input type="submit" value="Post it"><br>
                  </form>
                  <a class="nav" href="logout">Log Out</a><BR>
                  <a class="nav" href="index.jsp">Back to Shopping</a>
                  <br>
                  
                  <p>Copyright 2015@LaBellaFashion.com</p>
                  
        </body>
</html>         