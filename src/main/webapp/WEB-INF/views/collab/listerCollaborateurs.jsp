<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="dev.sgp.entite.Departement" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.3.1-
dist/bootstrap-4.3.1-dist/css/bootstrap.css">
</head>
<body>
	<h1>Les collaborateurs</h1>
	<div class="form-group">
		<label class="col-md-4 control-label" for="recherche">Rechercher
			un nom ou un prénom qui commence par :</label>
		<div class="col-md-4">
			<input id="recherche" name="recherche" type="text" placeholder=""
				class="form-control input-md" required="">
		</div>
	</div>

	<div class="form-group">
		<label class="col-md-4 control-label" for="singlebutton"></label>
		<div class="col-md-4">
			<button id="singlebutton" name="singlebutton" class="btn btn-primary">Rechercher</button>
		</div>
	</div>
	<%
		List<Departement> listeDepartement = (List<Departement>) request.getAttribute("listeDepartement");
		for (Departement departement : listeDepartement) {
	%>
	<div class="form-group">
		<label class="col-md-4 control-label" for="selectbasic">Filtrer
			par département</label>
		<div class="col-md-4">
			<select id="selectbasic" name="selectbasic" class="form-control">
				<option value="1">Option one</option>
				<option value="2">Option two</option>
				<option value="3">Option three</option>
				<option value="4">Option four</option>
			</select>
		</div>
	</div>
	<%
		}
	%>
	<ul>
		<%
			List<Collaborateur> listeCollabo = (List<Collaborateur>) request.getAttribute("listeCollabo");
			for (Collaborateur collabo : listeCollabo) {
		%>
		<img src="<%=collabo.getPhoto()%>" width=50px>
		<li><%=collabo.getMatricule()%></li>
		<li><%=collabo.getNom()%></li>
		<li><%=collabo.getPrenom()%></li>
		<li><%=collabo.getDateNaissance()%></li>
		<li><%=collabo.getAdresse()%></li>
		<li><%=collabo.getEmailPro()%></li>
		<li><%=collabo.getNumeroSecu()%></li>
		<li><%=collabo.getDateCreation()%></li>
		<li><%=collabo.getActif()%></li>

		<%
			}
		%>
	</ul>


</body>
</html>




