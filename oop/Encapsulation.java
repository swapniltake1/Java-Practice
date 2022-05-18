package oop;

public class Encapsulation {

	private void m1()     //Encapsulated method
	{
		
		System.out.println(" heyy am private method");
	}

	public void m2()    // non encapsulated method
	{
		System.out.println("hii am public method");
		m1();
	}
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.m1();    // we can call encapsulated methods in the class only.
		obj.m2();
	}
}
 

