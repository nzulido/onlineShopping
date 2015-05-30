<%@include file="/WEB-INF/jspf/header.jspf"  %>

<body>
      <h2 class="flash">${flash}</h2>
      <h3 align="center">  Login here</h3>
      <div class="bs-example1" align="center">
            <form action="checkLogin">
                <table>                    
                        <tr>
                            <td><label class="formElement" for="username">User Name:</label></td>
                            <td><input class="formElement" type="text" name="userName"/></td>
                        </tr>
                        <tr>
                            <td><label class="formElement" for="password">Password:</label></td>
                            <td><input class="formElement" type="password" name="Password"/></td>
                        </tr>
                        <tr>
                             <td colspan="2">Yet Not Registered!! <a href="signupForm">Register Here</a></td>
                        </tr>
                </table> 
                       <button  type="submit" class="formElement">Login</button> 
                       <button type="reset" value="Reset">Reset</button>
                <div class="checkbox">
                       <label><input type="checkbox"> Remember me</label>
                </div>              
            </form>
         </div>
       <p>Copyright 2015@LaBellaFashion.com</p>     
     </body>
</html>                          
