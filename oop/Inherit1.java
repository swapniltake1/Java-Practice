package oop;

public class Inherit1 {
	
		public void m1()
		{
			System.out.println("heyy this is method from class 1");
		}
	
}

public class Inherit2 extends Inherit1 
{
	public void m2()
	{
		System.out.println("heyy this is method from class 2");
	}
	
	public static void main(String[] args) {
		Inherit2 aa = new Inherit2();
		    aa.m2();
	}
}