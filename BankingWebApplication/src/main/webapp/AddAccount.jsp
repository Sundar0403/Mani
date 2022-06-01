<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD ACCOUNT</title>
<link rel="stylesheet" type="text/css" href="Admin.css">
</head>
<body>
<jsp:include page="CommonOptions.jsp"/>
<div>
<h3><marquee style="color:white;" scrollamount="15">Welcome to Account Addition!!!!</marquee></h3>
</div>
<div class="id4">
	<form action="AddAccount" method="post" name="account">
<fieldset class="red">
	<h2>Account Addition</h2>
	<label for="name">CustomerId:</label>
	<input type="text" id="name" name="customerId" required><br>
	<br><label for="name">Account Id:</label>
	<input type="text" id="name" name="accountId" required><br><br>
	<label for="name">Account Branch:</label>
	<input type="text" id="name" name="accountBranch" required><br><br>
	<input type="button" name="" value="Reset">
	<button>Finish</button>
</fieldset>	
</form>
</div>
</body>
</html>