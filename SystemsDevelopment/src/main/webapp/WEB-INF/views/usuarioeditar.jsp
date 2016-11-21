<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar Usuário</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/editarusuario">
		<div>
			<label for="idusuario">Código</label>
			<input type="text" name="IdUsuario" id="IdUsuario" value="${usuarioeditar.getIdUsuario()}" />
		</div>
		<div>
			<label for="nome">Nome</label>
			<input type="text" name="nome" id="nome" value="${usuarioeditar.nome}" />
		</div>
		<div>
			<label for="email">E-mail</label>
			<input type="text" name="email" id="email" value="${usuarioeditar.email}" />
		</div>	
		<div>
			<label for="CPF">CPF</label>
			<input type="text" name="CPF" id="CPF" value="${usuarioeditar.CPF}" />
		</div>	
		<div>
			<label for="login">Login</label>
			<input type="text" name="login" id="login" value="${usuarioeditar.login}" />
		</div>	
		<div>
			<label for="senha">Senha</label>
			<input type="password" name="senha" id="senha" value="${usuarioeditar.senha}" />
		</div>
		<div>
			<label for="status">Status</label>
			<input type="text" name="status" id="status" value="${usuarioeditar.status}" />
		</div>	
		<input type="submit" value="Alterar">
		<a href="/SystemsDevelopment/usuarios">Voltar</a>		
	</form>
</body>
</html>