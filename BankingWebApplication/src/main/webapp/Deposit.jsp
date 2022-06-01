<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DEPOSIT</title>
<link rel="stylesheet" type="text/css" href="CustomerOptions.css">
<style>
form.true
{
	margin-left:800px;
	background-color:white;
}
</style>
</head>
<body>
<jsp:include page="CommonOptions.jsp"/>
	<center><h2>Deposit Amount</h2></center>
	<form class="true" action="AdminOptions.jsp" method="post" style="" style="">
		<fieldset>
		<label for="name" style="background-color:white;">AccountId:</label>
		<select id="from" name="from">
			<option value="01">01</option>
			<option value="02">02</option>
			<option value="03">03</option>
			<option value="04">04</option>
			<option value="05">05</option>
			<option value="06">06</option>
			<option value="07">07</option>
			<option value="08">08</option>
		</select><br><br>
		
		<label for="Enter" style="background-color:white;">Deposit Amount:</label>
		<input type="number" id="Enter" min="100" max="100000"><br><br>
		<button>Submit</button>
		</fieldset>
	</form>
</body>
</html>