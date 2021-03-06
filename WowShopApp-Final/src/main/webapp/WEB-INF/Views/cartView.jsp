<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart Page</title>
</head>
  
 <body>
<jsp:include page="header.jsp"/>

<br/>
<div class="container">
<div class="row">
   
     
   <p> </p><p> </p>
   
       <div class="col-md-10 col-md-offset-1">

           <div class="panel panel-default panel-table">
             <div class="panel-heading">
               <div class="row">
                 <div class="col col-xs-6">
                   <h3 class="panel-title">Your Cart</h3>
                 </div>
               </div>
             </div>
             <div class="panel-body">
               <table class="table table-striped table-bordered table-list">
                 <thead>
                   <tr>
                     
                       <th>Name</th>
                       <th>Price</th>
                       <th>Quantity</th>
                       <th>Image</th> 
                       <th>Total</th>
                       <th><em class="fa fa-cog"></em></th>
                                                                                              
                   </tr> 
                 </thead>
                 <tbody>
                         
                        <c:set var="tot" value="0"></c:set>
                        <c:forEach items="${cartlist}" var="p">
                        <c:set var="t" value="${p.prices*p.quantity}"></c:set>
                		<c:set var="tot" value="${tot+t }"/>
                         <tr>
                        
                           <td>${p.productid.pname}</td>        
                           <td>${p.prices}</td> 
                           <td>${p.quantity }</td>
                           <td><img src=""${pageContext.request.contextPath}/resources/product/${productid.pimage}"  class="img-rounded" alt="${p.productid.pname }" width="75px" height="50px"/></td>         
                           <td>${p.prices*p.quantity}</td>
                           
                            <td>
                             <a class="btn btn-danger" href="./cart_delete?id=${p.cartid}"><em class="fa fa-trash"></em></a>
                           </td>
                           <tr>  
                            </c:forEach>     
                       
                       </tbody>
               </table>
           
             </div>
             <div class="panel-footer">
               <div class="row">
                 <h1 style="color: red;">Grand Total = <c:out value="${tot}"/></h1>  
               </div>
               <div class="btn-group wishlist">
					<a href="./">
						<button type="button" class="btn btn-danger">
							Continue Shopping 
						</button>
						</a>
					</div>
					 <div class="btn-group cart">
					<a href="customerDetails?tot=<c:out value="${tot}"/>">
						<button type="button" class="btn btn-danger">
							Check Out
						</button>
						</a>
					</div>
             </div>
             
           </div>

</div></div>
	</div>
    

<jsp:include page="footer.jsp"/>
</body>
</html>
