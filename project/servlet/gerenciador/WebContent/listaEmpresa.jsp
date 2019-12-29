<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresas Cadastradas - Servlet</title>
</head>
<body>	
	<c:if test="${not empty empresa}">
            Empresa ${ empresa } cadastrada com sucesso!
    </c:if>
    
    <c:if test="${not empty listaEmpresa}">
		Sem registros de empresas!
	</c:if>
    <br>	
   <ul>
		<c:forEach items="${listaEmpresa}" var="empresa">
			<li>${empresa.nomeEmpresa } - <fmt:formatDate pattern="dd/MM/yyyy" value="${empresa.dataAbertura }"/>
				<a href="/gerenciador/mostrarEmpresa?id=${empresa.id}"> Editar</a>
				<a href="/gerenciador/removerEmpresa?id=${empresa.id}"> Remover</a>
			</li>
			
		</c:forEach>
	</ul>
</body>
</html>