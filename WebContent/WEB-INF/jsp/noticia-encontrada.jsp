<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*,  br.com.dao.*,br.com.model.bean.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:formatDate value="${noticia.dataNoticia.time}" pattern="dd/MM/yyyy" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.0/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
<script src="http://code.jquery.com/ui/1.9.0/jquery-ui.js"></script>
<title>LISTA DE NOTICIAS</title>

<style>
table, td {
	border: 1px solid black;
}

table.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	<div style="text-align: center;" class="centro">
		<h2>SUCESSO NA BUSCA !</h2>
		<a href="mvc?logica=InicioLogica">Adicionar nova</a> <br> <br>
		<a href="mvc?logica=ListaNoticiasLogica">Listar todas</a> <br>
		<br> <a href="mvc?logica=ListaBuscaLogica${noticia.id}">Listar
			buscas</a>
		<c:import url="rodape.jsp" />

	</div>


</body>
</html>