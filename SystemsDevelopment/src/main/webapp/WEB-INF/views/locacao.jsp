<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Locações</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/salvarlocacao">
		<div>
			<label for="Usuario">Usuario</label>
			<input type="text" name="Usuario" id="Usuario"/>
		</div>
		<div>
			<label for="Item">Item</label>
			<input type="text" name="Item" id="Item"/>
		</div>
		<div>
			<label for="DataLocacao">Data de Locação</label>
			<input type="text" name="DataLocacao" id="DataLocacao"/>
		</div>
		<div>
			<label for="DataDevolucao">Data de Devolução</label>
			<input type="text" name="DataDevolucao" id="DataDevolucao"/>
		</div>
		<div>
			<label for="Observacoes">Observações</label>
			<input type="text" name="Observacoes" id="Obervacoes"/>
		</div>
		<div>
			<label for="DevolAtrasada">Devolução em Atraso</label>
			<input type="text" name="DevolAtrasada" id="DevolAtrasada"/>
		</div>			
		<div>
			<input type="submit" value="Cadastrar">
		</div>		
	</form>
</body>
</html>