<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário Servlet - Envia dados</title>
</head>
<body>

	<form action="/gerenciador/novaEmpresa" method="post">
		<label>Nome: <input type="text" name="nomeFantasia"></label>
		<label>Data: <input type="text" name="dataAberturaEmpresa"></label>
		<input type="submit">		
	</form>
	
</body>
</html>