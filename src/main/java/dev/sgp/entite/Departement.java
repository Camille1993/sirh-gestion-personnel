package dev.sgp.entite;

public class Departement {
	Integer Id;
	String nom;
	
	public Departement(Integer Id, String nom){
		this.Id =Id;
		
		this.nom=nom;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
