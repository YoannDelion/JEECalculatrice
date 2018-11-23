<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>
</head>
<body>
	<div>${ resultat }</div>
	
	<form method="post">
		<input type="number" name="operantUn">
        <select name="operateur" size="1">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="x">x</option>
            <option value="/">/</option>
        </select>
		<input type="number" name="operantDeux">
		<input type="submit" value="Calculer">
	</form>

</body>
</html>