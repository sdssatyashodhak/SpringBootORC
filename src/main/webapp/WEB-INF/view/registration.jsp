<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>ORC Register</title>
	<style>
		body
		{
			background-color: #ffffb3;
			text-align: center;
		}
	</style>
</head>
<body>
	<form action="welcomepage.jsp">
  		<fieldset>
    	<legend>Create your account :</legend>

    		<label for="rollno">Roll No. :</label>
    		<input type="text" id="rollno" name="rollno" required><br><br>

    		<label for="fname">Full Name:</label>
		    <input type="text" id="fname" name="fname" required><br><br>

		    <label for="email">Email:</label>
		    <input type="email" id="email" name="email" required><br><br>

		    <label for="dob">Birthdate :</label>
		    <input type="date" id="dob" name="dob" required><br><br>
		    
		    <label for="city">City :</label>
		    <input type="text" id="city" name="city" required><br><br>
		    
		    <label for="addr">Address :</label>
		    <input type="text" id="addr" name="addr" required><br><br>

		    <label for="pass"><b>Password</b></label>
    		<input type="password" placeholder="Enter Password" name="pass" required><br><br>
    		
    		<label for="passrep"><b>Repeat Password</b></label>
    		<input type="password" placeholder="Repeat Password" name="passrep" required><br><br>

		    <button type="submit">REGISTER</button>
  		</fieldset>
	</form>
</body>
</html>