package fr.afpa.cda.cours.heritage;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal monAnimal = new Animal(2) ;
		Chat monChat = new Chat() ;
		
		System.out.println(monAnimal);
		System.out.println(monChat);
	}

}
