package fr.afpa.cda.cours.heritage;

import java.util.Date;

public class Personne {
	
	/*
	 * Personnes  : 
		Attributs : nom , prenom , dateDeNaissance, sexe
		Méthodes : communiquer() , travailler() , ecrire()

	 * */
	
	
	private String nom ;
	private String prenom ;
	private Date dateDeNaissance;
	private char sexe ;
	private int cin ;
	
	public Personne(String nom, int cin) {
		this.nom = nom;
		this.cin = cin;
	}
	public Personne(int cin) {
		this.cin = cin;
	}
	
	
	public final void lire() {
		System.out.println("Je suis un humain qui sait lire !!");
	}
	
	
	public  void communiquer() {
		System.out.println("Je suis un humain qui communique !!");
	}; 	
	public  void travailler() {
		System.out.println("Je suis un humain qui travaille !!");
	}; 
	public  void ecrire() {
		System.out.println("Je suis un humain qui ecrire !!");
	} ;
	
	
	
	
	@Override
	public String toString() {
		return "nom=" + nom + ", cin=" + cin ;
	}
	
	
	

}
