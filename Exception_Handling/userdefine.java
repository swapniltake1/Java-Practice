package Exception_Handling;

public class userdefine extends Exception
{
  
	public static void m1() throws ArithmeticException   // throws keyword used to indicate this method is throws exception before u run handle this exception 
	{
	int a=10;
	int b=5;
	if(b==0)
	{
		throw new ArithmeticException("Used define exception");    // user define exceptio 
	}
	else {
		int c=a/b;
		System.out.println(c);
	}
	}
	public static void m2() {
		int d=10;
		int e=2;
	try {
		int c=d/e;
		System.out.println(c);    /// java define exceptiion      
		
	}
	catch(Exception e1)
	{
		System.out.println("user define exception");
	}
	}
 

	public static void main(String[] args) {
		m1();
		m2();
	}
}
