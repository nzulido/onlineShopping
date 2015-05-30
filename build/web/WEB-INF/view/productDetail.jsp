<%@ include file="/WEB-INF/jspf/header.jspf"  %>
<%@ page import ="java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<style>
    
    #productTable{
    height: 500px; /*your fixed height*/
    width: 100%;
    -webkit-column-count: 2;
       -moz-column-count: 2;
            column-count: 2; /* in those rules is just placeholder -- can be anything*/
    display: inline; /*necessary*/
    -webkit-column-gap: 100px; /* Chrome, Safari, Opera */
    -moz-column-gap: 100px; /* Firefox */
    column-gap: 100px;
    
    #sizes2049399{
              
        
    }

}
</style>
    
<body>
    <h2 class="flash">${flash}</h2>
       
        <sql:query var="categories" dataSource="jdbc/onlineshopping">
              SELECT * FROM category
        </sql:query>
        <sql:query var="categories" dataSource="jdbc/onlineshopping">
              SELECT * FROM product
        </sql:query>
        <sql:query var="selectedCategory" dataSource="jdbc/onlineshopping">
           SELECT name FROM product WHERE id = ?
           <sql:param value="${pageContext.request.queryString}"/>
        </sql:query>


        <sql:query var="selectedCategory" dataSource="jdbc/onlineshopping">
           SELECT name FROM category WHERE id = ?
           <sql:param value="${pageContext.request.queryString}"/>
        </sql:query>

        <sql:query var="categoryProducts" dataSource="jdbc/onlineshopping">
            SELECT * FROM product WHERE id = ?
            <sql:param value="${pageContext.request.queryString}"/>
        </sql:query>    
            <div>
        <table id="productTable">
             <c:forEach var="product" items="${categoryProducts.rows}" varStatus="iter">
                    <tr class="${((iter.index % 2) == 0) ? 'lightBlue' : 'white'}">
                        <td>                             
                          <img src="${initParam.productImagePath}${product.name}.jpeg"
                                  alt="${product.name}">                           
                            ${product.name}
                        </td>
                        <td>
                            ${product.name}
                            <br>
                            <span class="smallText">${product.description}</span>
                        </td>
                        <td>
                            &dollar; ${product.price} 
                        </td>
                        <td style="color:#CC0000">
                            ${product.rating} 
                        </td>
                    </tr>

             </c:forEach>                    
               <div class="sizes" id="sizes2049399">
                 <div id="sizeChartLink" class="standard sizeChartLink">size chart:</div>
                    <div id="sizesListDiv2049399">
                      <ul class=" sizes small" id="sizeList2049399">
                        <li title="2"
                        class="horizontal size"><span>2</span>
                        </li>
                        <li title="4"
                        class="horizontal size"><span>4</span>
                        </li>
                        <li title="6"
                        class="horizontal size"><span>6</span>
                        </li>
                        <li title="8"
                        class="horizontal size"><span>8</span>
                        </li>
                        <li title="10"
                        class="horizontal size"><span>10</span>
                        </li>
                        <li title="12"
                        class="horizontal size"><span>12</span>
                        </li>
                        <li title="14"
                        class="horizontal size"><span>14</span>
                        </li>

                    </ul>
                        <div id="printableSizes" class="printableSizes hidden">
                           2, 4, 6, 8, 10, 12, 14
                        </div>
                        <div>
                            <h4><a href="login">Write a review</a></h4>
                        </div>
                   </div>
                </div>      
                  
        </table>
                
            </div>
        
           
            
<!--           
        <div>
        
      <ul>
            <li><em>Product Details</em></li>
            <li><em id="productReviewTab">Reviews <span class="rating"><span style="width:94%"></span></span></em></li>
            <li><em>Product Q&amp;A</em></li>
    
        </ul>

        </div>             
  
            <br><br>
         <p>Copyright 2015@LaBellaFashion.com</p> 
     </body>
</html>
     