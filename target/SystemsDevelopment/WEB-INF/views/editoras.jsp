<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%-- <%@ include file="" %>  --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editoras</title>
</head>
<body>
<jsp:include page="/pages/menu.jsp"></jsp:include>	
	<h1>Editoras</h1>
	<br>
	<a href="/SystemsDevelopment/editoranovo" class="btn btn-success">+Nova Editora</a>
	<br>
	
	<table class="table" cellspacing="0" cellpadding="0">
		<tr>
			<td>Código</td>
			<td>Nome</td>
			<td>Observacoes</td>
			<td>Ativo</td>
			<td>...</td>
			<td>...</td>
		</tr>
		<c:forEach items="${editoraslista}" var="editoraitem">
			<tr>
				<td>${editoraitem.getIdEditora}</td>
				<td>${editoraitem.nome}</td>
				<td>${editoraitem.descricao}</td>
				<td>${editora.status}</td>
				<td><a href="/SystemsDevelopment/editorabyid?codigo=${editoraitem.getIdEditora()}" class="btn btn-warning">Editar</a></td>
				<td><a href="/SystemsDevelopment/removereditora?idEditora=${editoraitem.getIdEditora()}" class="btn btn-danger">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>