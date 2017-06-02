<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<html>
<head>

<link href='https://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>
<style>
body, html{
    background-color:#34515E;
   font-family: 'Open Sans Condensed', sans-serif;
    font-size: 18px;

}

.register-form{
    font-size: 16px;
   left: 50%;
    top: 50%;
    position: absolute;
    -webkit-transform: translate3d(-50%, -50%, 0);
    -moz-transform: translate3d(-50%, -50%, 0);
    transform: translate3d(-50%, -50%, 0);
}

.regbutton{    
    height: 50px;
    width: 200px;
    background-color:tomato;
    border-radius: 0px;
    font-size: 18px;
    color:white;
    border: none !important;
    margin-bottom: 5px;
}
.regbutton:hover{    
    color: white;
    background-color:#aa422f;
}
.regbutton:active{    
    color: white;
    background-color:#aa422f;
}
.logbutton{    
    height: 50px;
    width: 200px;
    background-color:yellowgreen;
    border-radius: 0px;
    font-size: 18px;
    color:white;
    border: none !important;
    margin-bottom: 5px;
}
.logbutton:hover{    
    color: white;
    background-color:darkolivegreen;
}
.logbutton:active{    
    color: white;
    background-color:darkolivegreen;
}



.register-form label{
    color: aliceblue;
    
}
.register-form input{
    margin-bottom: 5px;
    width: 430px;
    height: 40px;
    border-radius: 0px;
}
</style>

</head>

<header>
<jsp:include page="header.jsp"></jsp:include>

</header>
<Body>
<div class="container-fluid">
 
	 <form action="category" method="post" class="CategoryForm"> 
      <div class="row">      
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="CategorID">CATEGORY ID</label>
               <input id="c_id" name="c_id" class="form-control" type="text">    
           </div>            
      </div>
      <div class="row">
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="email">CATEGORY NAME</label>
               <input id="c_name " name="c_name" class="form-control" type="text">             
           </div>            
      </div>
      
    
      <div class="row">
           <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
           <button class="btn btn-default1">ADD</button>
           </div>
           <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
           <button class="btn btn-default2">CANCEL</button>           
          </div>          
      </div>    
      
        <hr>
      </form>
<form action="supplier" method="post" class="SupplierForm"> 
      <div class="row">      
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="CategorID">SUPPLIER ID</label>
               <input name="s_id" id="s_id" class="form-control" type="text">    
           </div>            
      </div>
      <div class="row">
           <div class="col-md-4 col-sm-4 col-lg-4">
              <label for="email">SUPPLIER NAME</label>
               <input  id="s_name" name="s_name" class="form-control" type="text">             
           </div>            
      </div>
      
      
      <div class="row">
           <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
           <button class="btn btn-default1">ADD</button>
           </div>
           <div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
           <button class="btn btn-default2">CANCEL</button>           
          </div>          
      </div>    
    </form>
<hr>
<!-- Product forms -->

  <form action="product" method="post" class="productForm">  
  

<!-- Form Name -->
<fieldset>
<legend>Add Product</legend>

 <div class="form-group">
  <label class="col-md-4 control-label" for="fn">Product Id</label>  
  <div class="col-md-4">
  <input Id= "pid" name="pid" type="text" >
    </div>
</div>
<br>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="ln">Product Name</label>  
  <div class="col-md-4">
  <input name="pname" id="pname" type="text" >
    
  </div>
</div>
<br>
<!-- DropDown input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="ln">Product Category</label>  
  <div class="col-md-4">
   
       <select id="cid" class="form-control" name="cname">
      <c:forEach var="clist" items="${clist}">

                <option value="${clist.id}">${clist.categoryname}</option>

            </c:forEach>
    </select>
    
  
    
  </div>
</div>
<br>
<div class="form-group">
  <label class="col-md-4 control-label" for="ln">Product Supplier</label>  
  <div class="col-md-4">
  <select id="psid" class="form-control" name="psid">
      <c:forEach var="slist" items="${slist}">

                <option value="${slist.supplierId}">${slist.suppliername}</option>

            </c:forEach>
    </select>
  
  </div>
</div>
<br>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="ln">Product Price</label>  
  <div class="col-md-4">
  <input name="price" type="text" >
    
  </div>
</div>
<br>
<!-- Text input-->
<br>
<div class="form-group">
  <label class="col-md-4 control-label" for="ln">Product Image</label>  
  <div class="col-md-4">
  <input name="pimage" type="text" >
    
  </div>
</div>
<br>
<div class="form-group">
  <label class="col-md-4 control-label" for="submit"></label>
  <div class="col-md-4">
    <button id="submit" name="submit" value="pAdd" class="btn btn-primary">Add</button>
     <button id="submit" name="submit" value="pcancel" class="btn btn-primary">Cancel</button>
  </div>
</div>

</fieldset>
</form>
</div>

  
<!--  end of product form -->






<footer>
<jsp:include page="footer.jsp"></jsp:include>
</footer>

</Body>

</html>