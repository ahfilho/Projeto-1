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

table {
	margin:auto;
}
</style>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	<div class="lista" style="text-align: center;">
		<h4>LISTA COMPLETA</h4>
		<jsp:useBean id="dao" class="br.com.dao.NoticiaDao" />
		<jsp:useBean id="noticia" class="br.com.model.bean.Noticia" />
		<a href="mvc?logica=InicioLogica">Adicionar nova</a> <br> <br>
		<a href="mvc?logica=ListaBuscaLogica${noticia.id}">Listar buscas</a>
		
		<form action="pesquisa" method="post">
			<h4>Pesquisar palavras-chave</h4>
			<input type="text" name="buscaPalavra"> <input type="submit"
				value="buscar">
		</form>
		<br>
		<table>
			<tr>
				<td><h4>ID</h4></td>
				<td><h4>Not�cia</h4></td>
				<td><h4>Data Not�cia</h4></td>
			</tr>
			<!-- percorre os clientes e monta as linhas da tabela -->
			<c:forEach var="noticia" items="${dao.lista}">
				<tr>
					<td>${noticia.id}</td>
					<td>${noticia.noticia}</td>
					<td>${noticia.dataNoticia.time}</td>
				</tr>
			</c:forEach>

		</table>

	</div>

	<c:import url="rodape.jsp" />

</body>
</html>