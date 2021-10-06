<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="teste"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.js"></script>
<script src="js/arquivo.js"></script>

<link rel="stylesheet" type="text/css" href="css/main.css">


<meta charset="ISO-8859-1">
<title>Java</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	<div class="inicio" style="text-align: center;">
		<br> <a href="mvc?logica=ListaNoticiasLogica${noticia.id}">Listar
			todos</a> <br>
		<h2>Cadastro de notícias</h2>
	</div>
	<form action="adicionaNoticia" method="POST">
		<div class="formulario" style="text-align: center;">
			<br> Noticia: <input style="width: 400px;" type="text"
				name="noticia"> <br> <br> Data da notícia:
			<teste:campoData id="dataNoticia" />
			<br> <br> <input type="submit" value="Salvar">
		</div>
		<br>
	</form>
	<c:import url="rodape.jsp" />
</body>
</html>