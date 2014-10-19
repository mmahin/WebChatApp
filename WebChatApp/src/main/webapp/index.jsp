<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>

<body>

<form>
<label for="username">Username:</label>
<input id="username" type="text" name="username">
<label for="password">Password:</label>
<input id="password" type="password" name="password">
</form>
<input type="checkbox">
<label class="check" for="checkbox">Keep me logged in</label>
<input type="submit" value="Login">
<form action="signup.jsp" method="post">
<input type="submit" value="Signup">
</form>
<p>
<a href="resetpassword.jsp">Forgot your password?</a>
</p>

</body>
</html>