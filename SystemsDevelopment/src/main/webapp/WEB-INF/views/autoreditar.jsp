<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar Autor</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/editarautor">
		<div>
			<label for="idautor">Código</label>
			<input type="text" name="IdAutor" id="IdAutor" value="${autoreditar.getIdAutor()}" />
		</div>
		<div>
			<label for="datanascimento">Data de Nascimento</label>
			<input type="text" name="datanascimento" id="datanascimento" value="${autoreditar.datanascimento}" />
		</div>
		<div>
			<label for="especialidadeliteraria">Especialidade Literária</label>
			<input type="text" name="especialidadeliteraria" id="especialidadeliteraria" value="${autoreditar.especialidadeliteraria}" />
		</div>
		<div>
			<label for="status">Status</label>
			<input type="text" name="status" id="status" value="${autoreditar.status}" />
		</div>	
		<input type="submit" value="Alterar">
		<a href="/SystemsDevelopment/autores">Voltar</a>		
	</form>
</body>
</html>