package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	String matricule;
	String nom;
	String prenom;
	LocalDate dateNaissance;
	String Adresse;
	String NumeroSecu;
	String emailPro;
	String photo;
	ZonedDateTime dateCreation;
	Boolean actif;
	String intitulePoste;
	Departement departement;
	
	public Collaborateur(String matricule, String nom, String prenom,
			LocalDate dateNaissance, String Adresse, String numeroSecu,
			String emailPro, String photo, ZonedDateTime dateCreation,
			boolean actif){
		this.matricule = matricule;
		this.nom = nom;
		this.prenom =prenom;
		this.dateNaissance = dateNaissance;
		this.Adresse = Adresse;
		this.NumeroSecu = numeroSecu;
		this.emailPro=emailPro;
		this.photo=photo;
		this.dateCreation= dateCreation;
		this.actif = actif;
		
	}
			
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	
	public String getNumeroSecu() {
		return NumeroSecu;
	}
	public void setNumeroSecu(String NumeroSecu) {
		this.NumeroSecu = NumeroSecu;
	}
	
	
	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	public ZonedDateTime getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(ZonedDateTime dateHeureCreation) {
		this.dateCreation = dateHeureCreation;
	}
	
	
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
}


