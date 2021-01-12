package fr.afpa.cda.cours.heritage;

public class Etudiant extends Personne {

	
	private float moyenne ;
	
	public Etudiant(String nom, int cin) {
		super(nom, cin);
		
	}
	
	public Etudiant(String nom, int cin , float moyenne) {
		super(nom, cin);
		this.moyenne = moyenne ;
	}

	public Etudiant(int cin, float moyenne) {
		super(cin) ;
		this.moyenne = moyenne ;
	}

	public void lireEt() {
		super.lire();
		System.out.println("Je suis un étudiant qui sait lire !!");
	}
	
	public void lire(String titreLivre) {
	
		System.out.println("Je sait lire !!");
		System.out.println("J'ai lu le livre "+titreLivre);
	}
	
	@Override
	public String toString() {
		return "Etudiant [moyenne=" + moyenne + ",  " + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(moyenne);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		if (Float.floatToIntBits(moyenne) != Float.floatToIntBits(other.moyenne))
			return false;
		return true;
	}
	
	
	
	
	
	



}
