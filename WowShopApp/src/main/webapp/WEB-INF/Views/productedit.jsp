<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

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
<body>
 <form action="product" method="post" class="productForm">  
  

<!-- Form Name -->
<fieldset>
<legend>Add Product</legend>

 <div class="form-group">
  <label class="col-md-4 control-label" for="fn">Product Id</label>  
  <div class="col-md-4">
  <input name="pid" type="text" >
    </div>
</div>
<br>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="ln">Product Name</label>  
  <div class="col-md-4">
  <input name="pname" type="text" >
    
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

</body>
</html>