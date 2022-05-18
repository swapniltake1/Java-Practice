package DesignPattern;

public class Singleton
{
private Singleton()
{                            // Constructer
	
}
private static Singleton obj;      // Classname object created
static
{
	System.out.println("Static");
	obj = new Singleton();                      // Object 
}
public static Singleton getdata()    // Static method with Classname datatype
{
	return obj;    // Written object
	
}
public void m1()
{
	System.out.println("    method m1   ");
}
public void m2()
{
	System.out.println("   method m2   ");
	
}
public void m3()
{
	System.out.println("     methiod m3    ");
}
}
