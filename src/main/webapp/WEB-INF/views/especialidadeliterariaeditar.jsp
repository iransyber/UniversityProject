<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar Especialidade Literária</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/editarespecialidadeliteraria">
		<div>
			<label for="idespecialidadeliteraria">Código</label>
			<input type="text" name="IdEspecialidadeLiteraria" id="IdEspecialidadeLiteraria" value="${especialidadeliterariaeditar.getIdEspecialidadeLiteraria()}" />
		</div>
		<div>
			<label for="descricao">Descrição</label>
			<input type="text" name="descricao" id="descricao" value="${especialidadeliterariaeditar.descricao}" />
		</div>
		<div>
			<label for="status">Status</label>
			<input type="text" name="status" id="status" value="${especialidadeliterariaeditar.status}" />
		</div>	
		<input type="submit" value="Alterar">
		<a href="/SystemsDevelopment/especialidadesliterarias">Voltar</a>		
	</form>
</body>
</html>