<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
<script type="text/javascript" src="./resources/js/jquery.min.js"></script>

<!--dialog  -->
 <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.9/jquery-ui.js" type="text/javascript"></script>
<link href="http://ajax.aspnetcdn.com/ajax/jquery.ui/1.8.9/themes/blitzer/jquery-ui.css"
    rel="stylesheet" type="text/css" />
    
    
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.2.0/jquery-confirm.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.2.0/jquery-confirm.min.js"></script>
<!--  -->
<style type="text/css">
#form1{
width:600px;
height: 280px;

position: relative;
left: 450px;
}
#form2{
width:600px;
height: 280px;

position: relative;
left: 450px;
}
#form3{
width:600px;
height: 280px;

position: relative;
left: 450px;
}
#panel1{
width:300px;
height: 800px;
display: inline;
border: 3px solid black;
padding: 250px 150px;
position: relative;
top: 250px;
background-color: #A52A2A;
color: silver;

}
#cat{
position: absolute;
top: 120px;
left: 20px;
}
#product{
position: absolute;
top: 20px;
left: 20px;
}
#supp{
position: absolute;
top: 220px;
left: 20px;
}
#b3{
position: absolute;
top: 300px;
left: 20px;
padding: 10px 40px;
}
#b2{
position: absolute;
top: 180px;
left: 20px;
padding: 10px 40px;
}
#b1{
position: absolute;
top: 80px;
left: 20px;
padding: 10px 40px;
}
</style>
<script type="text/javascript">

$(document).ready(function() {
   $("#form1").hide();
   $("#form2").hide();
   $("#form3").hide();

   $("#b1").click(function() {
   	 $("#form1").hide();
   	   $("#form2").hide();
   	   $("#form3").show();
   	   
   });
   
   $("#b2").click(function() {
 	 $("#form1").show();
 	   $("#form2").hide();
 	   $("#form3").hide();
 });
   
   $("#b3").click(function() {
 	 $("#form1").hide();
 	   $("#form2").show();
 	   $("#form3").hide();
 });
   

});

</script>




</head>
<body>
<div class="container">
<%-- <div>
        <div class="col-md-12 bg-danger">
            <%@include file="header.jsp" %>
        </div>
        <div class="col-md-3 bg-info" style="height: 300px;">
            <%@include file="footer.jsp" %>
        </div>
        <div class="col-md-9 bg-primary" style="height: 300px;">
            <%@include file="header.jsp" %>
        </div>
        <div class="col-md-12 bg-success">
            <%@include file="footer.jsp" %>
        </div>
    </div> --%>
<jsp:include page="header.jsp"/>
<br/>
<br/>
<div class="container">
<a href="supplierList"><b>Supplier  List</b></a> &nbsp;&nbsp;&nbsp;&nbsp;
<a href="categoryList"><b>Category List</b></a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="productList"><b>Product List</b></a>
</div>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<div id="panel1">
<label id="product"><h1>PRODUCT</h1></label>
<button id="b3">ADD</button>
<label id="cat"><h1>CATEGORY</h1></label>
<button id="b1">ADD</button>
<label id="supp"><h1>SUPPLIER</h1></label>
<button id="b2">ADD</button>
</div>
<script>
/* $(function () {
    'use strict';

    function confirmDialog(title, message, success) {
        var confirmdialog = $('<div></div>').appendTo('body')
            .html('<div><h6>' + message + '</h6></div>')
            .dialog({
                modal: true,
                title: title,
                zIndex: 10000,
                autoOpen: false,
                width: 'auto',
                resizable: true,
                buttons: {
                    Yes: function () {
                        success();
                        $(this).dialog("close");
                    },
                    No: function () {
                        $(this).dialog("close");
                    }
                },
                close: function() {
                    $(this).remove();
                }
            });

        return confirmdialog.dialog("open");
    }

    $('form').on('submit', function (e) {
        e.preventDefault();
        var form = this;

        confirmDialog('Confirm', 'Shell i Get the Data? ', function () {
            form.submit();
        });
    });
});
 */

 $.confirm({
	    title: 'Confirm!',
	    content: 'Simple confirm!',
	    buttons: {
	        confirm: function () {
	            $.alert('Confirmed!');
	        },
	        cancel: function () {
	            $.alert('Canceled!');
	        },
	        somethingElse: {
	            text: 'Something else',
	            btnClass: 'btn-blue',
	            keys: ['enter', 'shift'],
	            action: function(){
	                $.alert('Something else?');
	            }
	        }
	    }
	});
	      

 
</script>
<div id="form1">
<h2>Category Details</h2>
<hr/>

  <form id="form_purge" name="form_purge" action="category" >
    <div class="form-group">
      <label for="c_id">Category  ID :</label>
      <input type="text" class="form-control" id="c_id" placeholder="Enter Category ID" name="c_id" Required>
    </div>
    <div class="form-group">
      <label for="pwd">Category Name :</label>
      <input type="text" class="form-control" id="c_name" placeholder="Enter Category Name " name="c_name" Required>
    </div>   
    <button type="submit">ADD</button>
  </form>
<br/>
</div>

<div id="form2">
<hr/>
<h2>Supplier Details</h2>
<hr/>
  <form action="supplier">
    <div class="form-group">
      <label for="c_id">Supplier  ID :</label>
      <input type="text" class="form-control" id="s_id" placeholder="Enter Supplier ID" name="s_id" Required>
    </div>
    <div class="form-group">
      <label for="pwd">Supplier Name :</label>
      <input type="text" class="form-control" id="s_name" placeholder="Enter Supplier Name " name="s_name" Required >
    </div>   
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

<div id="form3">
  <h2>Product Details</h2>
<hr/>
  <!-- <form action="addProducts"  method="post"  enctype="multipart/form-data"> -->
  <form action="product" method="post"  enctype="multipart/form-data"  class="productForm">
    <div class="form-group">
  
     
  <label class="col-md-4 control-label" for="fn">Product Id</label>  
  <div class="col-md-4">
  <input Id= "pid" name="pid" type="text"  Required >
    </div>
</div>
<br>
<br>
<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="ln">Product Name</label>  
  <div class="col-md-4">
  <input name="pname" id="pname" type="text" Required >
    
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
  <input name="price" type="text"  Required>
    
  </div>
</div>
<br>
<!-- Text input-->
<br>
<div class="form-group">
  <label class="col-md-4 control-label" for="ln">Product Image</label>  
  <div class="col-md-4">
  <div class="form-group">
      <label for="img">Upload Image:</label>
      <input type="file" id="img" name="file" Required>
    </div>
   
  </div>
</div>
<br>
     
        <button type="submit" class="btn btn-primary" >Save</button>
  </form>
<br/>
<br/>
<hr/>
<br/>
</div>
<%-- <jsp:include page="footer.jsp"/> --%>
</div>

 

</body>
</html>
	
