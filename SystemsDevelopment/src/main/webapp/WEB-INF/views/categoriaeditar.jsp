<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar Categoria</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/editacategoria">
		<div>
			<label for="idcategoria">C�digo</label>
			<input type="text" name="IdCategoria" id="IdCategoria" value="${categoriaeditar.getIdCategoria()}" />
		</div>
		<div>
			<label for="descricao">Descri��o</label>
			<input type="text" name="descricao" id="descricao" value="${categoriaeditar.descricao}" />
		</div>
		<div>
			<label for="status">Status</label>
			<input type="text" name="status" id="status" value="${categoriaeditar.status}" />
		</div>	
		<input type="submit" value="Alterar">
		<a href="/SystemsDevelopment/categorias">Voltar</a>		
	</form>
</body>
</html>