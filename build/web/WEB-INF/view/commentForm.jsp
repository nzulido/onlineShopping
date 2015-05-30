<%@include file="/WEB-INF/jspf/header1.jspf"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"  trimDirectiveWhitespaces="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<body>
   <h2 class="flash">${flash}</h2>

     <div class="bs-example1">   
         <div class="form-group">
             <%
                String str = (String) session.getAttribute("userName");
                out.print("Welcome Back, " + str);
            %>             
             <h5><strong>Please, leave a review about the store/products</strong></h5>  
             
             <form action="ratingServlet" method="POST">  
                 <TABLE BGCOLOR="BLANCHEDALMOND" ALIGN="CENTER" BORDER="0">
                     <TR>   
                            <TD ALIGN="CENTER"> 
                                <input type="radio" name="rating" value="1" class="star">
                                <input type="radio" name="rating" value="2" class="star">
                                <input type="radio" name="rating" value="3" class="star">
                                <input type="radio" name="rating" value="4" class="star">
                                <input type="radio" name="rating" value="5" class="star">
<!--                            <INPUT TYPE="radio" NAME = "rating" VALUE = "Excellent"> Excellent 
                                <INPUT TYPE="radio" NAME = "rating" VALUE = "Good"> Good 
                                <INPUT TYPE="radio" NAME = "rating" VALUE = "Average" CHECKED> Average 
                                <INPUT TYPE="radio" NAME = "rating" VALUE = "Poor"> Poor 
                                <INPUT TYPE="radio" NAME = "rating" VALUE = "Overhaul"> Needs an Overhaul-->
                            </TD>
                    </TR>

                    <TR>
                                <TD ALIGN="CENTER"><B>Comments or Suggestions:</B>
<!--                                <TD ALIGN="CENTER"> <TEXTAREA ROWS="6" COLS="40" Name="suggestions">
                                      Enter any comments or suggestions you have here.</TEXTAREA>-->
                                    <input type="hidden" name="action" value="post"/>
                                    <input type="submit" value="Post it!"/>
                                    <a class="nav" href="index?action=category">Back to Shopping</a>
                                </TD>
                    </TR>
                 </table>
              </form>
                                             
                                 
         </div>
     </div>
    </body>
</html>
