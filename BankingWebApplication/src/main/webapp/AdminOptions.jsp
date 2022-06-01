<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="CustomerOptions.css">
</head>
<body>
<jsp:include page="CommonOptions.jsp"/>

<center><h2>ADMIN OPTIONS</h2></center>

<table bgcolor="white">
	<tr class="main">
		<th>AccountId</th>
		<th>Account Balance</th>
		<th>Branch</th>
	</tr>
	<tr class="sub">
		<td>1001</td>
		<td>5000.50</td>
		<td>Pallathur</td>
	</tr>
	<tr class="sub">
		<td>1002</td>
		<td>6000.00</td>
		<td>Pallathur</td>
	</tr>
	<tr class="sub">
		<td>1003</td>
		<td>2500.00</td>
		<td>Pallathur</td>
	</tr>
</table>
</body>
</html>