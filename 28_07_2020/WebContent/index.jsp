<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Lesson 1</title>
</head>
<body>
	<h1>${ title }</h1>
	<p>
		Tên : ${ name } <br/>
		Tuổi : ${ Age } tuổi	
	</p>
	<form action="index.html">
		<input name="name"/> <br/>
		<input name="age"/> <br/>
		<button formmethod="get">Send</button>	
	</form>
</body>
</html>
