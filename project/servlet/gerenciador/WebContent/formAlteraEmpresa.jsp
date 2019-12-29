<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:url value="/alteraEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário Servlet - Alterar Dados</title>
</head>
<body>

	<form action=${linkServletNovaEmpresa} method="post">
		<label>Nome: <input type="text" value="${empresa.nomeEmpresa}"/>
		<label>Data: <input type="text" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" name="dataAberturaEmpresa"/>
		<input type="submit">		
	</form>
	
</body>
</html>