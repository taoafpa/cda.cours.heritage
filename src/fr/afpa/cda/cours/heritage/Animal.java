package fr.afpa.cda.cours.heritage;

public class Animal {

	public int nbPattes;

	
	

	public Animal(int nbPattes) {
	//	super();
		this.nbPattes = nbPattes;
	}

	@Override
	public String toString() {
		return "Animal [nbPattes=" + nbPattes + "]";
	}
	
	
	
	
}
