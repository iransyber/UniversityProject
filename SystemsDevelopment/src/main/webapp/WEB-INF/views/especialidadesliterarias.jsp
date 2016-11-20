<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nova EspecialidadeLiteraria</title>
</head>
<body>	
	<h1>Especialidades Literarias</h1>
	<br>
	<a href="/SystemsDevelopment/especialidadeliterarianovo">+Nova Especialidade Literária</a>
	<br>
	
	<table cellspacing="1" border="1" cellpadding="1">
		<tr>
			<td>Código</td>
			<td>Descrição</td>
			<td>Ativo</td>
			<td>...</td>
			<td>...</td>
		</tr>
		<c:forEach items="${especialidadesliterariaslista}" var="especialidadeliterariaitem">
			<tr>
				<td>${especialidadeliterariaitem.getIdEspecialidadeLiteraria()}</td>
				<td>${especialidadeliterariaitem.descricao}</td>
				<td>${especialidadeliterariaitem.status}</td>
				<td><a href="/SystemsDevelopment/especialidadeliterariabyid?codigo=${especialidadeliterariaitem.getIdEspecialidadeLiteraria()}">Editar</a></td>
				<td><a href="/SystemsDevelopment/removerespecialidadeliteraria?idEspecialidadeLiteraria=${especialidadeliterariaitem.getIdEspecialidadeLiteraria()}">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>