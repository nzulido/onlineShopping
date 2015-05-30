<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page import="edu.acc.j2ee.Product"%>
<%@page import="edu.acc.j2ee.searchServlet"%>

<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@include file="/WEB-INF/jspf/header.jspf"  %>

<style>
    p {
        color: white;
    }
</style>
<body>    
    <h2 class="flash">${flash}</h2>
    <sql:query var="categories" dataSource="jdbc/onlineshopping">
           SELECT * FROM category
     </sql:query>
    
     <sql:query var="selectedCategory" dataSource="jdbc/onlineshopping">
        SELECT name FROM category WHERE id = ?
        <sql:param value="${pageContext.request.queryString}"/>
     </sql:query>
    
     <sql:query var="categoryProducts" dataSource="jdbc/onlineshopping">
         SELECT * FROM product WHERE category_id = ?
         <sql:param value="${pageContext.request.queryString}"/>
     </sql:query>  
         
     <div id="Container">
       <table width="700px" align="center"
               style="border:1px solid #000000;">
                <tr style="background-color:lightgrey;">                    
                    <td><b>Name</b></td>
                    <td><b>Price</b></td>
                    <td><b>Description</b>                 
                    <td><b>id</td>
                    <td><b>Image</b></td>
                </tr>
                
                <%
                
                if (request.getAttribute("resultList") != null) {
                    ArrayList result = (ArrayList)request.getAttribute("resultList");
                    Iterator itr = result.iterator();
                    
                    while (itr.hasNext()) {     
                                            
                    Product product =(Product)itr.next();                    
               %> 
               <tr>
                   <td><%=product.getName()%></td>
                   <td><%=product.getPrice()%></td>
                   <td><%=product.getDescription() %></td>
                   <td><%=product.getId() %></td>
                   <td><img src="image.jsp?id=1 "></td>
               </tr>  
      
                 
                <%     }                  
                    
                    }
                %> 
                
            
                <%
                              
                    if (request.getAttribute("resultList") == null) {
                     
                %>
                
                     <tr>
                         <td colspan=4 align="center"
                              style="background-color:#eeffee"><b>No Record Found.. for </b></td>
                     </tr>
                      <%            
                         }
                
                      %>
      </table>
        
       <div id="footer">
           <div id="welcomeText">
              <p>About Us</p>
              <p>Copyright 2015@LaBellaFashion.com</p>
           </div>
       </div>  
     </div>
  </body>
</html>
     