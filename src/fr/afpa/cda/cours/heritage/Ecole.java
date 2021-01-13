package fr.afpa.cda.cours.heritage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Ecole :
Dans notre �cole on a des enseignants et des �l�ves , 
la liste des enseignants est fixe alors que la liste des �l�ves changent.
On a une administration et une vie scolaire .
Il faudra afficher  la liste des personnes en appelant les diff�rentes m�thodes toString().
afficher le nombre de personnes qui composent notre �cole .
On ne peut pas h�riter de la classe �cole .

 * */



public class Ecole {

	
	
	public static void main(String[] args) {
		
		// Tableau fixe
		 Enseignant[]  listeEnseignant = new Enseignant[7] ;
		// Liste variable ou dynamique
		 List<Eleve> listeEleves = new ArrayList<Eleve>() ;
		// Liste variable ou dynamique
		List<PersonelVieSco> listePersonelVieSco = new ArrayList<PersonelVieSco>() ;
		LocalDate dateNaissanceMarcel = LocalDate.of(2000, 2, 13)  ;
		PersonelVieSco pion = new PersonelVieSco("Bourlingueur", "Marcel", dateNaissanceMarcel, 'M',
				12369696, "Pion", 1100.0) ;
		LocalDate dateNaissanceRobert = LocalDate.of(1981, 8, 13)  ;
		Enseignant robert = new Enseignant("Laffont", "Robert", dateNaissanceRobert, 'M', 0123654, 1800, 
				"Professeur", "Math�matiques") ;
		int[] listeNotes = {15,12,19,10};
		Eleve olivier = new Eleve("Olive", "Olivier", LocalDate.of(1990, 9, 11), 'M', 23456789, 
				"6�me", 6, listeNotes);
		
		
		
		
		listeEleves.add(olivier) ;
		listeEleves.add(new Eleve("Aziz", "Abedel", LocalDate.of(1989, 8, 11), 'M', 
				                   23451789, "5�me", 6, new int[]{17,10,13,5}));
				
		listeEnseignant[0] = robert ; 
		listeEnseignant[1] = new Enseignant("Merveille", "Alice", LocalDate.of(1990, 11, 11), 'F', 0125654, 1900, 
				"Professeur", "Math�matiques")  ; 
		listePersonelVieSco.add(pion) ;
		listePersonelVieSco.add(new PersonelVieSco("Lasympathique", "Aurelie", LocalDate.of(1980, 5, 6), 'F',
				12369686, "Responsable", 1800.0) ) ;
		
		String RED = "\u001B[31m" ;
		System.out.println(RED+"Dans notre superbe �cole nous avons cette �quipe");
		System.out.println("============================");
		System.out.println("Liste des eleves");
		System.out.println(listeEleves);
		System.out.println("============================");
		System.out.println("Liste des enseignants");
		
		for(int i =0 ; i<listeEnseignant.length ; i++ ) {
			System.out.println(listeEnseignant[i]);
		} ;
		
		System.out.println("============================");
		System.out.println("Liste du personnel de vie scolaire");
		System.out.println(listePersonelVieSco);
	}

}
