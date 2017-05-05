

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">

		<!-- Website CSS style -->
		<link rel="stylesheet" type="text/css" href="assets/css/main.css">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		<!-- Google Fonts -->
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>

		<title>Admin</title>
		<script>
function myFunction() {
    var x = document.getElementById("myEmail").pattern;
    document.getElementById("demo").innerHTML = x;
}
</script>
<style>
.title{
 text-align: center;
  
}
body {
    background-image: url("images/world.jpg");
   -webkit-background-size: cover;
        -moz-background-size: cover;
        -o-background-size: cover;
        background-size: cover;
}
img{
display: block;
    margin: auto;
    width: 40%;
}

</style>

	</head>
	<body ><br><br><br>
	<img src="images/login.jpg" height="200" width="500"><br>
		
				<div class="divmain" align="center">
					<form class="form-horizontal" method="post" action="LoginServlet" onclick="myFunction()">

						<div class="form-group">
							<label for="email" class="cols-sm-2 control-label">Your Email</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="email" id="email"  pattern="[a-z0-9._%+-]+@[a-z]{5}+\.[a-z]{2,3}$" placeholder="Enter your Email" required/>
								</div>
							</div>
						</div><br>

						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password" maxlength="8" size="8"/>
								</div>
							</div>
						</div><br><br>

						<div class="form-group ">
						<input type="submit" value="Login"> 
						
							<!--  <button type="button" class="btn btn-primary btn-lg btn-block login-button">Register</button>-->
						</div>
						</form><br>
						<form method="get" action="register.jsp">
                        <input type="submit" value="Register">
                        </form>
				</div>
			

		<script type="text/javascript" src="assets/js/bootstrap.js"></script>
		
	</body>
</html>
