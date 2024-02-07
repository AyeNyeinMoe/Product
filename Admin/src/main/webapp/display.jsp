<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
  
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
 <%--  <jsp:useBean id="myProduct" class="model.ProductSetGet" scope="request" /> --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="NewAdd.jsp" method="get">
<h1> Product Information</h1><br><br>

 <c:forEach var="p" items="${product}">
 
 	<ul>
 		<li>ID:${p.id }</li>
 		<li>Name:${p.name }</li>
 		<li>Price:${p.price }</li>
 		<li>Quantity:${p.qty }</li>
 		<li>Date:${p.date }</li>
 	</ul>
 
</c:forEach> 
 
 			<%-- ID :<jsp:getProperty property="id" name="myBean"/><br>
			Name:<jsp:getProperty property="name" name="myBean"/><br>
			Price:<jsp:getProperty property="price" name="myBean"/><br>
			Quantity:<jsp:getProperty property="qty" name="myBean"/><br>
			Date:<jsp:getProperty property="date" name="myBean"/><br><br>
  --%>
		
			
			<input type="submit" value="Register"/>

</form>
</body>
</html>