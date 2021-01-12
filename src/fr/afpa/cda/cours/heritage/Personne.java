package fr.afpa.cda.cours.heritage;

public class Personne {
	private String nom ;
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
	
	@Override
	public String toString() {
		return "nom=" + nom + ", cin=" + cin ;
	}
	
	
	

}
