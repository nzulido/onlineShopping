<%@ page import="java.sql.*,java.io.*,java.util.*" %> 

<%@include file="/WEB-INF/jspf/header.jspf"  %>

<style>
    p {
        color: white;
    }
</style>
<body>    
    <h2 class="flash">${flash}</h2>
    
    <%--Read requested parameters and serve the respective image --%>
<%
  int id =  Integer.parseInt(request.getParameter("keyword"));
  
  try{      
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","javauser");      
    Statement st=con.createStatement();
    String strQuery = "select image from product where name="+id;
    ResultSet rs = st.executeQuery(strQuery);

    String imgLen="";
    if(rs.next()){
      imgLen = rs.getString(1);
       }  
    rs = st.executeQuery(strQuery);
    if(rs.next()){
      int len = imgLen.length();
      byte [] rb = new byte[len];
      InputStream readImg = rs.getBinaryStream(1);
      int index=readImg.read(rb, 0, len);  
      st.close();
      response.reset();
      response.getOutputStream().write(rb,0,len); 
      response.getOutputStream().flush();        
    }
  }
  catch (Exception e){
    e.printStackTrace();
  }
%>