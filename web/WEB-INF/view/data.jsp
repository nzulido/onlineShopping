<%@ page import="java.sql.*,java.io.*,java.util.*" %> 


<%@include file="/WEB-INF/jspf/header.jspf"  %>

<style>
    p {
        color: white;
    }
</style>
<body>    
    <h2 class="flash">${flash}</h2>
 <div id="Container">
       <table width="100%px" align="center"
               style="border:1px solid #000000;">
        <tr>
            <th>Name</th>
            <th>Description</th>
            <th>Price</th>
            <th>Image</th>
        </tr>
     <%
       try{    
      
           String keyword=request.getParameter("keyword");
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","javauser");
           Statement stmt=con.createStatement();
           String strQuery = ("SELECT * FROM product "
                           + "where name LIKE '%" + keyword.trim() + "%' ");
           ResultSet rs = stmt.executeQuery(strQuery);
           
        while(rs.next()){
     %>
        <tr>
           <td><%=rs.getString("name")%>
           </td><td><%=rs.getString("description")%></td>
           <td><%=rs.getBigDecimal("price")%></td>
           <td><img src="/onlineShopping/imageServlet?id=<%=rs.getInt("id") %>" alt="image" ></td>
        </tr>
      <%
    }
    rs.close();
    con.close();
    stmt.close();
  }
  catch(Exception e)
  {
    e.getMessage();
  }
  %>
 </table>
 
     </div>
  </body>
</html>
     