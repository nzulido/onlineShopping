  <%@include file="/WEB-INF/jspf/header.jspf"  %>
  
<head> 
      
<script type="text/javascript"> 
     
        function validate_form(){    
        var firstpassword=document.form.password.value;
        var secondpassword=document.form.password2.value;
        var username = document.form.username.value;
        var emailAddress = document.emailAddress.value;
        
        if(firstpassword === secondpassword){
        return true;
        }
        else{
        alert("password must be same!");  
        return false;
        }
        
        if(username_validation(username,5,12))  
        {  
        if(firstpassword_validation(firstpassword,7,12))  
        {  
        if(allLetter(username))  
        {  
        if(ValidateEmail(emailAddress))  
        {  
        }  
        }   
        }  
        }   
        return false;  
        }          
        
    
       
        
//        if ( username.length() < 4 || username.length() > 10 ){
//        alert ( "Username must be between 4 and 10 characters." );
//        return false;
//        }
//        if ( firstpassword.length() < 4 || firstpassword.length() > 10 ){
//        alert ( "Password must be between 4 and 10 characters" );
//        return false;
//        }
//        else{
//        alert("sucessfully Submitted");
//        return true; 
//        }
//        if (!(/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/).test(document.form.emailAddress.value)) {  
//            alert("You have entered an invalid email address!");  
//            return (false);   
//          } 
//
//        }
        
    //**************************************************************************
        function username_validation(username,mx,my)  
        {  
        var username_len = username.value.length;  
        if (username_len === 0 || username_len >= my || username_len < mx)  
        {  
        alert("User Id should not be empty / length be between "+mx+" to "+my);  
        username.focus();  
        return false;  
        }  
        return true;  
        }
        
//    //**************************************************************************
        function firstpassword_validation(firstpassword,mx,my)  
        {  
        var firstpassword_len = firstpassword.value.length;  
        if (firstpassword_len === 0 ||firstpassword_len >= my || firstpassword_len <firstpassword mx)  
        {  
        alert("Password should not be empty / length be between "+mx+" to "+my); 
        firstpassword.focus();  
        return false;  
        }  
        return true;  
        }  
//    //**************************************************************************
//        function allLetter(username)  
//        {   
//        var letters = /^[A-Za-z]+$/;  
//        if(username.value.match(letters))  
//        {  
//        return true;  
//        }  
//        else  
//        {  
//        alert('Username must have alphabet characters only');  
//        username.focus();  
//        return false;  
//        }  
//        }  
//   //***************************************************************************
//        function ValidateEmail(emailAddress)  
//        {  
//        var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
//        if(emailAddress.value.match(mailformat))  
//        {  
//        return true;  
//        }  
//        else  
//        {  
//        alert("You have entered an invalid email address!");  
//        emailAddress.focus();  
//        return false;  
//        }  
        //}  
            
</script>    
    
  </head>
<body>
   <h2 class="flash">${flash}</h2>  
   <h3 align="center"><strong>Enter information below</strong></h3> 
   <form name="form" action="servlet/RegisterServlet" method="post" onsubmit="return Validate_form()">
       <table cellspacing="5" border="0" align="center">
             <tr>
                  <td align="right">First Name:</td>
                  <td><input type="text" name="firstName" required></td>
              </tr>
              <tr> 
                   <td align ="right">Last Name:</td>
                   <td><input type="text" name="lastName" required></td>
              </tr>
              <tr>
                   <td align="right">Email Address:</td>
                   <td><input type="text" name="emailAddress" required></td>
              </tr>
              <tr> 
              <tr>
                   <td align="right">User Name</td>
                   <td><input type="text" name="username" required value="" /></td>
              </tr>
              <tr>
                  <td align="right">Password</td>
                   <td><input type="password" name="password" required value="" /></td>
                   <td align="right">Confirm Password</td>
                   <td><input type="password" name="password2" required/></td>                   
              </tr>  
              <tr>
                        <td><input type="submit" value="Submit" /></td>
                        <td><input type="reset" value="Reset" /></td>
              </tr>
              <tr>
                   <td colspan="2">Already registered!! <a href="index.jsp">Login Here</a></td>
              </tr>
          </table>
                   
       </form>
    <div id="footer">
    <div id="welcomeText">
        <p>About Us</p>
        <p>Copyright 2015@LaBellaFashion.com</p>
    </div>
    </div>
  </body>
  
</html>
