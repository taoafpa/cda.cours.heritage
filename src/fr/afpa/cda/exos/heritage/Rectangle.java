package fr.afpa.cda.exos.heritage;

public class Rectangle {

	private int a ;
	private int b ;
	
	public Rectangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int surface() {
		return a*b;
	}
	
}
