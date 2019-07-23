<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add a New Item</h1>
 <table class = "admin"> 
  <thread>
   <tr>
     <th>Name</th><th>Description</th><th>Quantity</th><th>Price</th>
   </tr>
  </thread>
  <tbody>
  <tr><form action= "Save" method="post">
                   <td><input name="name"></td>
                   <td><input name="description"></td>
                   <td><input name="quantity"></td>
                   <td><input name="price"></td>
                  <td><button>Save</button></td>
                  </form>  
               </tr>
               </tbody>
            <a href= "/Admin-add">Administration</a>
       </table>
	</body>
</html>
