package XYZ;

public class Allinone
{
	private static Allinone AA =new Allinone();
  private Allinone()
  {
	System.out.println("Cunstructer");  
  }
  
   static
  {
	  System.out.println("Static block");
  }
  
  // Init block
  {
	  System.out.println("Init block");
	 
  }
  
  public static Allinone m1()
  {
	  System.out.println("method m1");
	  return AA;
  }
  
  public static Allinone m2()
  {
	  System.out.println("method m2");
	  return AA;
  }
  
  
}
