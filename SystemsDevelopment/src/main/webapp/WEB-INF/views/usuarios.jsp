<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novo Usuário</title>
</head>
<body>	
	<h1>Usuario</h1>
	<br>
	<a href="/SystemsDevelopment/usuarionovo">+Novo Usuário</a>
	<br>
	
	<table cellspacing="1" border="1" cellpadding="1">
		<tr>
			<td>Código</td>
			<td>Nome</td>
			<td>Email</td>
			<td>CPF</td>
			<td>Login</td>
			<td>Status</td>
		</tr>
		<c:forEach items="${usuarioslista}" var="usuarioitem">
			<tr>
				<td>${usuarioitem.getIdUsuario()}</td>
				<td>${usuarioitem.nome}</td>
				<td>${usuarioitem.email}</td>
				<td>${usuarioitem.CPF}</td>
				<td>${usuarioitem.login}</td>
				<td>${usuarioitem.status}</td>
				<td><a href="/SystemsDevelopment/usuariobyid?codigo=${usuarioitem.getIdUsuario()}">Editar</a></td>
				<td><a href="/SystemsDevelopment/removerusuario?idUsuario=${usuarioitem.getIdUsuario()}">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>