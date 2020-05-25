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

	<script type="text/javascript">

		function railRoute() 
		{
		  var routeId = document.getElementById("route").value;

		  var stationDD = document.getElementById("station");

		  stationDD.disabled=false;


          if(routeId==1)
		  {
		  		stationDD.options.length=0;
                stationDD.options[0] = new Option('Select your Station', '');
                stationDD.options[1] = new Option('Dahisar', 'dahisar');
                stationDD.options[2] = new Option('Borivali', 'borivali');
                stationDD.options[3] = new Option('Andheri', 'andheri');
                stationDD.options[4] = new Option('Dadar', 'dadar');
		  }
		  if(routeId==2)
		  {
		  		stationDD.options.length=0;
                stationDD.options[0] = new Option('Select your Station', '');
                stationDD.options[1] = new Option('Badlapur', 'badlapur');
                stationDD.options[2] = new Option('Thane', 'thane');
                stationDD.options[3] = new Option('Dadar', 'dadar');
                stationDD.options[4] = new Option('CST', 'cst');
		  }
		  if(routeId==3)
		  {
		  		stationDD.options.length=0;
                stationDD.options[0] = new Option('Select your Station', '');
                stationDD.options[1] = new Option('Kurla', 'kurla');
                stationDD.options[2] = new Option('Vashi', 'vashi');
                stationDD.options[3] = new Option('Mansarovar', 'mansvr');
                stationDD.options[4] = new Option('Panvel', 'panvel');
		  }
		  if(routeId==4)
		  {
		  		stationDD.options.length=0;
                stationDD.options[0] = new Option('Select your Station', '');
                stationDD.options[1] = new Option('Airoli', 'airoli');
                stationDD.options[2] = new Option('Vashi', 'vashi');
                stationDD.options[3] = new Option('Nerul', 'nerul');
                stationDD.options[4] = new Option('Panvel', 'panvel');
		  }
		}
	</script>

</head>
<body>
	<form action="registration">
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


		    <b>Railway Route :</b>
		    <!-- Dropdown for Railway Route -->
		    <select id="route" onchange="railRoute()" required>
		    	<option value="" disabled selected hidden>Choose your Route</option>
				<option value="1">WESTERN RAILWAY LINE</option>
				<option value="2">CENTRAL RAILWAY LINE</option>
			    <option value="3">HARBOUR RAILWAY LINE</option>
				<option value="4">TRANS HARBOUR RAILWAY LINE</option>
			</select>

			<br><br>

		
			Railway Station :

			<select id="station" disabled>
				<option value="" disabled selected>Choose your Station</option>
			</select>

		    <br><br>

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