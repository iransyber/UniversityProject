<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nova Locação</title>
</head>
<body>	
	<h1>Locações</h1>
	<br>
	<a href="/SystemsDevelopment/locacaonovo">+Nova Locação</a>
	<br>
	
	<table cellspacing="1" border="1" cellpadding="1">
		<tr>
			<td>Código</td>
			<td>Usuário</td>
			<td>Item</td>
			<td>Data de Locação</td>
			<td>Data de Devolução</td>
			<td>Observações</td>
			<td>Devolução em Atraso</td>
		</tr>
		<c:forEach items="${locacoeslista}" var="locacaoitem">
			<tr>
				<td>${locacaoitem.getIdLocacao()}</td>
				<td>${locacaoitem.usuario}</td>
				<td>${locacaoitem.item}</td>
				<td>${locacaoitem.datalocacao}</td>
				<td>${locacaoitem.datadevolucao}</td>
				<td>${locacaoitem.observacoes}</td>
				<td>${locacaoitem.devolatrasada}</td>
				<td><a href="/SystemsDevelopment/locacaobyid?codigo=${locacaoitem.getIdLocacao()}">Editar</a></td>
				<td><a href="/SystemsDevelopment/removerlocacao?idLocacao=${locacaoitem.getIdLocacao()}">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>