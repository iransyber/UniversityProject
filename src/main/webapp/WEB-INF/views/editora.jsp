<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editoras</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/salvareditora">
		<div>
			<label for="Nome">Nome</label>
			<input type="text" name="Nome" id="Nome"/>
		</div>
		<div>
			<label for="Nome">Observacoes</label>
			<input type="text" name="Observacoes" id="Observacoes"/>
		</div>
		<div>
			<label for="Status">Status</label>
			<input type="text" name="Status" id="Status"/>
		</div>	
		<div>
			<input type="submit" value="Cadastrar">
		</div>		
	</form>
</body>
</html>