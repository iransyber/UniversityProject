<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Autores</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/salvarautor">
		<div>
			<label for="Nome">Nome</label>
			<input type="text" name="Autor" id="Autor"/>
		</div>
		<div>
			<label for="DataNascimento">Data de Nascimento</label>
			<input type="text" name="DataNascimento" id="DataNascimento"/>
		</div>
		<div>
			<label for="EspecialidadeLiteraria">Especialidade Liter�ria</label>
			<input type="text" name="EspecialidadeLiteraria" id="EspecialidadeLiteraria"/>
		</div>
		<div>
			<label for="Status">Ativo</label>
			<input type="text" name="Status" id="Status"/>
		</div>	
		<div>
			<input type="submit" value="Cadastrar">
		</div>		
	</form>
</body>
</html>