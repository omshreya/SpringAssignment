s<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product List</h1>  
	<table border="2" width="70%" cellpadding="2">  
	<tr><th>Id</th><th>Name</th><th>Category</th></tr>  
   <c:forEach var="product" items="${list}">   
   <tr>  
   <td>${product.product_Id}</td>  
   <td>${product.product_Name}</td>  
   <td>${product.category}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
</body>
</html>