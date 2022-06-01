<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="CommonOptions.css">
</head>
<body>
<form>
	<a href="AddAccount.jsp"><input style="margin-left:1300px;"type="button" class="add" value="Add Account"></a>
	<a href="AddCustomer.jsp"><input style="margin-left:1300px;"type="button" class="add" value="Add Customer"></a>
	<a href="Admin.jsp"><input style="margin-left:1300px;"type="button" class="add" value="Logout"></a>
</form>
<form>
	<fieldset>
		<legend style="color:white;">Options</legend>
		<br><a href="CustomerDetails.jsp"><input type="button" value="Customer"></a><br>
		<br><a href="AdminOptions.jsp"><input type="button" value="Account"></a><br>
		<br><a href="Deposit.jsp"><input type="button" value="Deposit"></a><br>
		<br><a href="Withdraw.jsp"><input type="button" value="Withdraw"></a><br>
		<br><a href="TransferAmount.jsp"><input type="button" value="Transfer"></a>
		
	</fieldset>
</form>
</body>
</html>