<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros</title>
</head>
<body>
	<form method="post" action="/SystemsDevelopment/salvarlivro">
		<div>
			<label for="Descricao">Descrição</label>
			<input type="text" name="Descricao" id="Descricao"/>
		</div>
		<div>
			<label for="Descricao">Categoria</label>
			<input type="text" name="Categoria" id="Categoria"/>
		</div>
		<div>
			<label for="Descricao">Sinopse</label>
			<input type="text" name="Sinopse" id="Sinopse"/>
		</div>
		
		<div>
			<label for="Descricao">Autor</label>
			<input type="text" name="Autor" id="Autor"/>
		</div>
		
		<div>
			<label for="Descricao">Editora</label>
			<input type="text" name="Editora" id="Editora"/>
		</div>
		
		<div>
			<label for="Descricao">AnoLancamento</label>
			<input type="text" name="AnoLancamento" id="AnoLancamento"/>
		</div>
			
		<div>
			<label for="Descricao">Quantidade</label>
			<input type="text" name="Quantidade" id="Quantidade"/>
		</div>
		<div>	
			<label for="Descricao">Status</label>
			<input type="text" name="Status" id="Status"/>
		</div>
		<div>
			<input type="submit" value="Cadastrar">
		</div>		
	</form>
</body>
</html>