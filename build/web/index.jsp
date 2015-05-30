<%@include file="/WEB-INF/jspf/header.jspf"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<style>
    #indexRightColumn{
    height: 400px; /*your fixed height*/
    width: 100%;
    -webkit-column-count: 3;
       -moz-column-count: 3;
            column-count: 3; /*3 in those rules is just placeholder -- can be anything*/
}
    #indexRightColum categoryBox{
    display: inline-block; /*necessary*/
}
</style>

<body>
    <h2 class="flash">${flash}</h2>
    <sql:query var="categories" dataSource="jdbc/onlineshopping">
        SELECT * FROM category
    </sql:query>         
         <div id="indexRightColumn">
               <c:forEach var="category" items="${categories.rows}">
                     <div class="categoryBox">
                          <a href="category?${category.id}"> 
                              <span class="categoryLabelText">${category.name}</span>
                              <img src="${initParam.categoryImagePath}${category.name}.jpeg"
                                    alt="${category.name}">
                          </a>
                     </div>
                </c:forEach>     
         </div> 
      
        
        
        <p>Copyright 2015@LaBellaFashion.com</p>
     
</body>
</html>