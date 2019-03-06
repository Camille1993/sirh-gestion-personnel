package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class EditerCollaborateursController extends HttpServlet {

	public static final String VUE = "/WEB-INF/views/collab/newCollaborateur.jsp";
	private CollaborateurService collabService =Constantes.COLLAB_SERVICE;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		LocalDate dateNaissance = LocalDate.parse(req.getParameter("dateNaissance"));
		String adresse = req.getParameter("adresse");
		String numeroSecu = req.getParameter("numeroSecu");

		String photo = "/sgp/asset/phot_profil.png";
		String Matricule = nom.substring(0, 1) + prenom.substring(0, 1) + (Math.random() * (9999));
		String emailPro = prenom + "." + nom + "@societe.com";
		ZonedDateTime dateCreation = ZonedDateTime.now();
		boolean actif = true;

		if (checkForm("nom") && checkForm("prenom") && checkForm("adresse")) {
			collabService.sauvegarderCollaborateur(
					new Collaborateur(Matricule, nom, prenom, dateNaissance, adresse, numeroSecu, 
							emailPro, photo, dateCreation, actif));
			resp.sendRedirect("/sgp/collaborateurs/lister");
		} else {
			resp.sendError(400, "Des champs contiennent des caractère spéciaux");
		}
		
	}

	boolean checkForm(String data) {
		boolean result = true;

		if (data.matches(".*[/+<>@].*")) {
			result = false;
		}
		return result;
	}
}
