<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novo Autor</title>
</head>
<body>	
	<h1>Autores</h1>
	<br>
	<a href="/SystemsDevelopment/autornovo">+Novo Autor</a>
	<br>
	
	<table cellspacing="1" border="1" cellpadding="1">
		<tr>
			<td>Código</td>
			<td>Nome</td>
			<td>DataNascimento</td>
			<td>EspecialidadeLiteraria</td>
			<td>Ativo</td>
		</tr>
		<c:forEach items="${autoreslista}" var="autoritem">
			<tr>
				<td>${autoritem.getIdAutor()}</td>
				<td>${autoritem.nome}</td>
				<td>${autoritem.datanascimento}</td>
				<td>${autoritem.especialidadeliteraria}</td>
				<td>${autoritem.status}</td>
				<td><a href="/SystemsDevelopment/autorbyid?codigo=${autoritem.getIdAutor()}">Editar</a></td>
				<td><a href="/SystemsDevelopment/removerautor?idAutor=${autoritem.getIdAutor()}">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>