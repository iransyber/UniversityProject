<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar Editora</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/editareditora">
		<div>
			<label for="ideditora">Código</label>
			<input type="text" name="IdEditora" id="IdEditora" value="${editoraeditar.getIdEditora()}" />
		</div>
		<div>
			<label for="nome">Nome</label>
			<input type="text" name="nome" id="nome" value="${editoraeditar.nome}" />
		</div>
		<div>
			<label for="observacoes">Observações</label>
			<input type="text" name="observacoes" id="observacoes" value="${editoraeditar.observacoes}" />
		</div>
		<div>
			<label for="status">Status</label>
			<input type="text" name="status" id="status" value="${editoraeditar.status}" />
		</div>	
		<input type="submit" value="Alterar">
		<a href="/SystemsDevelopment/editoras">Voltar</a>		
	</form>
</body>
</html>