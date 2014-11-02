<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.10.4.min.js"></script>
<script type="text/javascript" src="js/login.js">
	
</script>
</head>

<body>
	<div id="container">
		<div id="header">
			<h1>Login to Chat App</h1>
		</div>

		<div id="login">
			<div id="loginfrm">
				<form name="loginfrm" method="POST" action="login">
					<ul id="listup">
						<li><input id="username" type="text" name="username"
							placeholder="Username or Email" required></li>
						<li><input id="password" type="password" name="password"
							placeholder="Password" required></li>
						<li id="checkbox"><input type="checkbox"> <label
							id="check" for="checkbox">Keep me logged in</label></li>

						<li><input id="loginbtn" type="submit" value="Login"></li>
					</ul>
				</form>
			</div>
			<div id="loginsts"></div>
			<div id="signupfrm">

				<ul id="listdown">
					<li id="signup">Haven't Register Yet?.</li>

					<li><a href="signup.jsp"><input id="signupbtn"
							type="submit" value="Signup"> </a></li>
					<li id="reset"><a href="resetpassword.jsp">Forgot your
							password?Click Here.</a></li>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>