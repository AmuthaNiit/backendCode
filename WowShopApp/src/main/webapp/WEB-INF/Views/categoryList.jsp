

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org">
<head>
	<meta charset="utf-8" />
	<title>Spring Boot + JPA + Datatables</title>
	<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
	<script src="./resources/js/jquery.min.js"></script>
	<script src="./resources/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="./resources/css/jquery.dataTables.min.css">
	
</head>

<body>
	<h1>Category Table</h1>
	<table id="categoryTable" class="display">
      
       <!-- Header Table -->
       <thead>
            <tr>
                <th>Id</th>
				<th>Name</th>
              
                
            </tr>
        </thead>
        <!-- Footer Table -->
        <tfoot>
            <tr>
                <th>Id</th>
				<th>Name</th>
              
            </tr>
        </tfoot>
    </table>
    <script src="./resources/js/jquery.dataTables.min.js"></script>
	<script src="./resources/js/datatable.js"></script>
    
</body>
</html>