<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<%@page import="edu.acc.j2ee.searchServlet"%>
<%@include file="/WEB-INF/jspf/header.jspf"  %>
<style>
    .noResut{
        background-color: white;
    }
</style>

<body>    
    <h2 class="flash">${flash}</h2>

    <div id="Container">
           <table width="700px" align="center"
                style="border:1px solid #000000;">                    
                        <tr>
                           <td colspan=4 align="center"
                                style="background-color:#eeffee"><b>Sorry, no results found for your research</b></td>
                        </tr><br><br>
          </table>
        
          <div class="noResut" >
              <h4 class="hdr">For better results:<br><br></h4>
                   <ol>
                       <li>Check for spelling mistakes or typos<br></li>
                       <li>Search by Web ID<br></li>
                       <li>Use generic keywords<br></li>
                   </ol>
          </div>
        
       <div id="footer">
           <div id="welcomeText">
              <p>About Us</p>
              <p>Copyright 2015@LaBellaFashion.com</p>
           </div>
       </div>  
     </div>
  </body>
</html>