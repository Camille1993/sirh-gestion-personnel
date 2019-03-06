<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-
dist/bootstrap-4.3.1-dist/css/bootstrap.css">
	</head>
	<body>
		<h1>Les collaborateurs</h1>
		<ul>
		<%
		List<Collaborateur> listeCollabo =(List<Collaborateur>)request.getAttribute("listeCollabo");
		for (Collaborateur collabo : listeCollabo) {

		%>
			<img src="<%=collabo.getPhoto() %>" width =50px>
			<li><%= collabo.getMatricule() %></li>
			<li><%= collabo.getNom() %></li>
			<li><%= collabo.getPrenom() %></li>
			<li><%= collabo.getDateNaissance() %></li>
			<li><%= collabo.getAdresse() %></li>
			<li><%= collabo.getEmailPro() %></li>
			<li><%= collabo.getNumeroSecu() %></li>
			<li><%= collabo.getDateCreation() %></li>
			<li><%= collabo.getActif() %></li>
			
		<%
		}
		%>
		</ul>
		
	</body>
</html>




