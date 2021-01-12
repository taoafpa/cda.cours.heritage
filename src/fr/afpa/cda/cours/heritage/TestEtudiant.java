package fr.afpa.cda.cours.heritage;

public class TestEtudiant {

	public static void main(String[] args) {
		
		Etudiant francois = new Etudiant("François", 0121323232) ;
		Etudiant franck = new Etudiant("Franck", 0121323232, 19) ;
		Etudiant aziz = new Etudiant("abdel",  19,5) ;
		Etudiant olivier = new Etudiant(21525252, 20) ;
		System.out.println(francois);
		System.out.println(franck);
		System.out.println(aziz);
		System.out.println(olivier);
	//	aziz.lire();
		aziz.lire("Java pour les experts");
	}

}
