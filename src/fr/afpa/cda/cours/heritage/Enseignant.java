package fr.afpa.cda.cours.heritage;

import java.time.LocalDate;

public class Enseignant extends Personne {
 /*
  * Enseignants
Attributs : salaire , fonction  , matiere
Méthodes : enseigne() , evalue()

  * */
	
	//Attributs : salaire , fonction  , matiere
	
	double salaire ;
	String fonction ; 
	String matiere  ;
	// Le constructeur
	
	public Enseignant(String nom, String prenom, LocalDate dateDeNaissance, char sexe, int cin, double salaire,
			String fonction, String matiere) {
		super(nom, prenom, dateDeNaissance, sexe, cin);
		this.salaire = salaire;
		this.fonction = fonction;
		this.matiere = matiere;
	}
	
	//Méthodes : enseigne() , evalue()
	
	
	public void enseigne() {
		System.out.println("Moi j'enseigne "+matiere);
	} 
	
	public void evalue()  {
		System.out.println("Moi j'evalue le travail des élèves pour connaitre leur niveau en "+matiere);
	}

	@Override
	public String toString() {
		return "Enseignant [salaire=" + salaire + ", fonction=" + fonction + ", matiere=" + matiere + ", "
				+ super.toString() + "]";
	} 
	
	
	
}
