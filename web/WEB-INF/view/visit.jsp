<%@include file="/WEB-INF/jspf/header.jspf"  %>
<style>    
    p {
        color: white;
    }
    #indexRightColumn{
        background-color: white;
        float: contour;
        
    }
</style>
<body>
    
    <h2 class="flash">${flash}</h2>
      <div id="indexRightColumn">
        <p class="header" style="color: red"><strong> Visit Us</strong><p>
         <address>
           Written by <a href="mailto:webmaster@example.com">Liliane Nzukou
           </a>.<br> 
           <strong>Visit us at:</strong><br><br><br>500 Terry Francois St.<BR>San Francisco, CA
           94158 <br>info@mysite.com <br>Tel: 123-456-7890 <br>Fax: 123-
           456-7890

         </address>

        <div id="footer" style="float: left">
           <div id="about" style="float: left">
               <p><a href="aboutUs">About Us</a></p>
              <p>Copyright 2015@LaBellaFashion.com</p>
           </div>
        </div>
  </div>
 </body>
</html>