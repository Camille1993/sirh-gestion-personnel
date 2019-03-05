package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		resp.setContentType("text/html");

		if (matriculeParam == null){
			resp.sendError(400, "Un matricule est attendu");
		}else{
			resp.getWriter().write("Matricule =" + matriculeParam);	
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matriculeParam = req.getParameter("matricule");
		String titreParam = req.getParameter("titre");
		String nomParam = req.getParameter("nom");
		String prenomParam = req.getParameter("prenom");
		String paramNull="";


		if (matriculeParam == null ){
			paramNull += "matricule, ";
		}

		if (titreParam == null ){
			paramNull += "titre, ";
		}

		if (nomParam == null ){
			paramNull += "nom, ";
		}

		if (prenomParam == null ){
			paramNull += "prenom.";
		}
		if(matriculeParam == null || titreParam == null || nomParam== null || prenomParam ==null){
			resp.sendError(400, "Les paramètres suivants sont incorrects :" + paramNull);
		}

		if(matriculeParam != null && titreParam != null && nomParam!= null && prenomParam !=null){
			resp.setStatus(201);
			resp.getWriter().write("Creation d'un collaborateur avec les informations suivantes :"
					+ "<ul>"
					+ "<li> matricule= "+ matriculeParam +", titre= " + titreParam + ", nom= " + nomParam + ", prenom= "+prenomParam +"</li>"
					+ "</ul>");
		}
	}

}
