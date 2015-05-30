<%@include file="/WEB-INF/jspf/header.jspf"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<style>
    
    #productTable{
    -webkit-column-count: 2; /* Chrome, Safari, Opera */
    -moz-column-count: 2; /* Firefox */
    column-count: 2;

    -webkit-column-gap: 40px; /* Chrome, Safari, Opera */
    -moz-column-gap: 40px; /* Firefox */
    column-gap: 40px;

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
                            <a href="productDetail?${product.id}"> 
                                  <img src="${initParam.productImagePath}${product.name}.jpeg"
                                          alt="${product.name}">
                            </a>

                        </td>
                        <td>
                            ${product.name}
                            <br>
                            <span class="smallText">${product.description}</span>
                        </td>
                        <td>
                            &dollar; ${product.price} 
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
     