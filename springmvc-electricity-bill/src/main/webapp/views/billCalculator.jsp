<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bill Calculator</title>
</head>
<body>

     <h2>Electricity Bill Calculator</h2>
     
     <form action="calculateBill">
     
     Customer Name: <input type = "text" name = "name"> <br><br>
     Units Consumed: <input type = "number" name = "unit"> <br><br>
     
     <input type ="submit" name = "Calculate Bill">
     
     </form>

</body>
</html>