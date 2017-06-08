
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header>  
<!-- <div class="container" style="background-color:powderblue;">
   <div class="jumbotron">
    <h3 >Women's Shopping Corner</h3>
<img id = "logo" src=".\resources\image\Logo.jpg"  alt="Cinque Terre"> 

</div>
</div> -->

</header>

<nav class="navbar navbar-default">
	<div class="container-fluid">

		<div class="navbar-header" style="background-color:powderblue;">
			<!-- <button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button> -->
							
			<a class="navbar-brand" href="./">				
				<img src="${pageContext.request.contextPath}\resources\image\SAREELOGO.png"
				 style="width:40px;height:10px; "/>
			</a>
		</div>		
 		
		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				
			<!-- 	<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Products <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li>Category 1</li>
						<li>Category 1</li>
						<li>Category 1</li>
					</ul>
				</li>   -->
				
			<!--  	<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Products <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<c:forEach var="catlist" items="${catalist}">
							<li><a href="productFilter?id=${catlist.c_id}">${catlist.c_name}</a></li>
							<%--   <option value="${clist.c_id}">${clist.c_name}</option>
 --%>
						</c:forEach>

					</ul></li>   -->
					<%-- <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="true" >Products<span class="caret"></span></a>
            <ul class="dropdown-menu" >
              <c:forEach var="clist" items="${catlist}">
								<li><a href="productFilter?id=${clist.id}">${clist.categoryname}</a></li>              					

            				</c:forEach>

              </ul>
          </li>
 --%>					
					<li><a href="<c:url value="productview"/>" role="button" aria-haspopup="true"
					aria-expanded="false">Product</a></li>
					
				
				
				
					<li><a href="${pageContext.request.contextPath}/admin/add" role="button" aria-haspopup="true"
					aria-expanded="false">Add</a></li>
			</ul>
		
			
				<c:if test="${pageContext.request.userPrincipal.name  == 'admin'}">
                                <li><a href="<c:url value="/admin" />">Admin</a></li>
                 </c:if>
                 </ul>
			  <ul class="nav navbar-nav navbar-right">
			  <c:if test="${pageContext.request.userPrincipal.name == null }">
					<li>
					<a href=' <c:url value="/login" />'>Login</a>
					</li>
				<li><a href="signup">Signup</a></li>
				
				</c:if>
				<c:if test="${pageContext.request.userPrincipal.name  != null}">
                               <li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
	              				<li><a href='<c:url value="/logout" />'>Signout</a></li>
                 </c:if>
				
				</ul>
		</div>		
	</div>
</nav>

<%-- <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Women's Shoping</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">About us</a></li>
      <li><a href="add">Adding</a></li>
      <li><a href="productList">ProductList</a>
      <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >Dropdown <span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <c:forEach var="clist" items="${catlist}">
								<li><a href="productFilter?id=${clist.id}">${clist.categoryname}</a></li>              					

            				</c:forEach>

              </ul>
          </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="./signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Log In</a></li>
    </ul>
  </div>
</nav>
 --%>

</body>
</html>