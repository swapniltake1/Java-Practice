package oop;

public class Child extends InheritanceParent {
	
	
	public void m3()
	{
		System.out.println("hii am m3333");
	}
	

	public static void main(String[] args) {
		
		
		
		
		
		Child obj = new Child();
              obj.m1();
              InheritanceParent.m2();  // obj.m2();   /* in static way*/ InheritanceParent.m2();
              obj.m3();
             
              
	}

}
