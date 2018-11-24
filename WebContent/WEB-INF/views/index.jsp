<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenue sur mon blog !</title>
</head>
<body>
	<a href ="form.html">Insertion d'un nouvel article</a>
	<h1>Liste des articles</h1>
	<div>
		<c:forEach var="article" items="${articles}">
		<div class ="article">
		<h2>
		${article.title}
		<a href="delete.html?id=${article.id}"> X</a>
		</h2>
		<p>${article.content}</p>
		</div>
		</c:forEach>
	</div>
	
</body>
</html>