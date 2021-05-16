<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>POST PARAMETER</title>
</head>
<body>
	<h1>POST</h1>
	<form action="index.php">
		<div>
			Họ Tên : <input name="txtFullname"/>		
		</div>
		<hr/>
		<div>
			Lương  : <input name="txtSalary"/>			
		</div>
		<div>
			<button formmethod="post"/>Tính Lương</button>			
		</div>
	</form>
</body>
</html>