package fr.afpa.cda.cours.heritage;

import java.time.LocalDate;
import java.util.Date;


public class PersonelVieSco extends Personne{

	// Attributs : fonction , salaire
	String fonction ;
	double salaire ;
	private static int nbVieSco = 0 ;
	// Le constructeur
	
	public PersonelVieSco(String nom, String prenom, LocalDate dateDeNaissance, char sexe, int cin, String fonction,
			double salaire) {
		super(nom, prenom, dateDeNaissance, sexe, cin);
		this.fonction = fonction;
		this.salaire = salaire;
		nbVieSco++ ;
	}
	
	
	//M�thodes : punir() , organiser() , orienter()
	
	public void punir() {
		System.out.println("Moi quand ils se tiennent pas correctement c'est la punition !!");
	} 
	public void organiser() {
		System.out.println("Moi je super organis� !!");
	} 
	public void orienter() {
		System.out.println("Moi j'oriente vers les bonnes fili�res !!");
	}


	@Override
	public String toString() {
		return "PersonelVieSco [fonction=" + fonction + ", salaire=" + salaire + ", " + super.toString()
				+ "]";
	}


	
	

	
	
	
}
