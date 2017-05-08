<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usuários</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/salvarusuario">
		<div>
			<label for="Nome">Usuários</label>
			<input type="text" name="Nome" id="Nome"/>
		</div>
		<div>
			<label for="Email">Email</label>
			<input type="text" name="Email" id="Email"/>
		</div>
		<div>
			<label for="CPF">CPF</label>
			<input type="text" name="CPF" id="CPF"/>
		</div>
		<div>
			<label for="Login">Login</label>
			<input type="text" name="Login" id="Login"/>
		</div>
		<div>
			<label for="Senha">Senha</label>
			<input type="password" name="Senha" id="Senha"/>
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