<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nova Categoria</title>
</head>
<body>	
	<h1>Categorias</h1>
	<br>
	<a href="/SystemsDevelopment/categorianovo">+Nova Categoria</a>
	<br>
	
	<table cellspacing="1" border="1" cellpadding="1">
		<tr>
			<td>Código</td>
			<td>Descrição</td>
			<td>Ativo</td>
			<td>...</td>
			<td>...</td>
		</tr>
		<c:forEach items="${categoriaslista}" var="categoriaitem">
			<tr>
				<td>${categoriaitem.getIdCategoria()}</td>
				<td>${categoriaitem.descricao}</td>
				<td>${categoriaitem.status}</td>
				<td><a href="/SystemsDevelopment/categoriabyid?codigo=${categoriaitem.getIdCategoria()}">Editar</a></td>
				<td><a href="/SystemsDevelopment/removercategoria?idCategoria=${categoriaitem.getIdCategoria()}">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>