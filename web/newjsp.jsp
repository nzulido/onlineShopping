<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<style>
    
    #productTable{
    height: 500px; /*your fixed height*/
    width: 100%;
    -webkit-column-count: 4;
       -moz-column-count: 4;
            column-count: 4; /*3 in those rules is just placeholder -- can be anything*/
    display: inline; /*necessary*/
    -webkit-column-gap: 100px; /* Chrome, Safari, Opera */
    -moz-column-gap: 100px; /* Firefox */
    column-gap: 100px;

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
         
         
     <table id="productTable">

    <c:forEach var="product" items="${categoryProducts.rows}" varStatus="iter">

        <tr class="${((iter.index % 2) == 0) ? 'lightBlue' : 'white'}">
            <td>
                <img src="${initParam.productImagePath}${product.name}.jpeg"
                    alt="${products.name}">
                ${product.name}
                
            </td>
            <td>
                ${product.name}
                <br>
                <span class="smallText">${product.description}</span>
            </td>
            <td>
                &dollar; ${product.price} / unit
            </td>
           </tr>

    </c:forEach>

</table>
      
         <div id="footer">
        <div id="welcomeText">
               <p>About Us</p>
               <p>Copyright 2015@LaBellaFashion.com</p>
        </div>
 
       </div>
     </body>
</html>
     