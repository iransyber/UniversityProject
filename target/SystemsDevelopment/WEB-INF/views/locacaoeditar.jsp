<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar Locação</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/editarlocacao">
		<div>
			<label for="idlocacao">Código</label>
			<input type="text" name="IdLocacao" id="IdLocacao" value="${locacaoeditar.getIdLocacao()}" />
		</div>
		<div>
			<label for="usuario">Usuário</label>
			<input type="text" name="usuario" id="usuario" value="${locacaoeditar.usuario}" />
		</div>
		<div>
			<label for="item">Item</label>
			<input type="text" name="item" id="item" value="${locacaoeditar.item}" />
		</div>
		<div>
			<label for="datalocacao">Data de Locação</label>
			<input type="text" name="datalocacao" id="datalocacao" value="${locacaoeditar.datalocacao}" />
		</div>
		<div>
			<label for="datadevolucao">Data de Devolução</label>
			<input type="text" name="datadevolucao" id="datadevolucao" value="${locacaoeditar.datadevolucao}" />
		</div>
		<div>
			<label for="observacoes">Observaçoes</label>
			<input type="text" name="observacoes" id="observacoes" value="${locacaoeditar.observacoes}" />
		</div>
		<div>
			<label for="devolatrasada">Devolução em Atraso</label>
			<input type="text" name="devolatrasada" id="devolatrasada" value="${locacaoeditar.devolatrasada}" />
		</div>
		<input type="submit" value="Alterar">
		<a href="/SystemsDevelopment/locacoes">Voltar</a>		
	</form>
</body>
</html>