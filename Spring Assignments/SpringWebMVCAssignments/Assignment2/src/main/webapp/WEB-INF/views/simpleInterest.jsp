<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Simple Interest Form</h1>
	<form action="index" method="POST">
		<label for="principal">Principal: <input type="number"
			id="principal" name="principal" />
		</label> <label for="time">No. of Years: <input type="number" id="time"
			name="time" />
		</label> <label for="interest">Rate of interest: <input type="number"
			id="interest" name="interest" />
		</label>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>