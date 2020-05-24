<!DOCTYPE html>
<html>
<head>
	<title>ORC Login</title>
	<style>
		body
		{
			background-color: #ffffb3;
			text-align: center;
		}
	</style>
</head>
<body>
	<form>
  		<fieldset>
    	<legend>Please Enter User ID (Roll number) and Password to login : </legend>
    		<label for="userid">User ID :</label>
    		<input type="text" id="userid" name="userid"><br><br>
		    <label for="pass">Password :</label>
		    <input type="password" id="pass" name="pass"><br><br>
		    <button type="submit">LOGIN</button>
  		</fieldset>
	</form>
	<br><br><br>
  		<b>Not a registered user ?</b>
  		<br>
	<!-- <button onclick="location.href='/registerpage.jsp';">REGISTER</button> -->
	<a href="/registerpage.jsp">REGISTER</a>
</body>
</html>