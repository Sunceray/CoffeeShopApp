<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>

<h1> Menu </h1>
<table class= "table"> 
 <thead>
   <tr> 
     <th>Name</th><th>Description</th><th>Quantity</th><th>Price</th>
	</tr>
	</thead>
           <tbody>
               <c:forEach var="item" items="${items}">
               <tr>
                   <td>${ item.name }</td>
                   <td>${ item.description }</td>
                   <td>${ item.quantity }</td>
                   <td>$${ item.price }0</td>
               </tr>
               </c:forEach>
           </tbody>
             <a href= "/home">Home</a>
       </table>
	</body>
</html>