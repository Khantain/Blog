<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="">
		<h1>Insertion d'un nouvel article</h1>
			
		<div>
			<label for="title">Titre de l'article : </label> <input id="title"
				name="title">
		</div>
		
		<div>
			<label for="content">Contenu : </label> <textarea id="content"
				name="content"></textarea>
		</div>

		<button type="submit">Valider</button>
		<button type="reset">Reinitialiser le formulaire</button>
	</form>
</body>
</html>