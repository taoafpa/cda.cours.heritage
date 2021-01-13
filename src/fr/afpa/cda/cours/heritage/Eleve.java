package fr.afpa.cda.cours.heritage;

import java.time.LocalDate;
import java.util.Arrays;


public class Eleve extends Personne {
	
	//Attributs :
	String classe ;  
	int niveau ;  
	int[] listeNotes ;
	static int nbEleves = 0 ;
	
	// Le constructeur
	public Eleve(String nom, String prenom, LocalDate dateDeNaissance, char sexe, int cin, String classe, int niveau,
			int[] listeNotes) {
		super(nom, prenom, dateDeNaissance, sexe, cin);
		this.classe = classe;
		this.niveau = niveau;
		this.listeNotes = listeNotes;
		nbEleves++ ;
	}
	
	//Méthodes : 
	
	public void apprendre() {
		System.out.println("J'apprends les sciences et la littérature");
	}  
	public double  calculerMoyenne() {
		double somme = 0.0 ;
		for (int i=0 ; i<listeNotes.length ; i++) {
			somme += listeNotes[i] ;
		}
		
		return somme/listeNotes.length ;
	}

	@Override
	public String toString() {
		return "Eleve [classe=" + classe + ", niveau=" + niveau + ", listeNotes=" + Arrays.toString(listeNotes)
				+ ", moyenne = " + calculerMoyenne() + ", " + super.toString() + "]";
	}
	
	
	

}
