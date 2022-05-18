package Exception_Handling;

public class TryCatchEx1 
{  
	
	
	public static void m1() {
		
  int i=50;
  int b=5;
 
  
  while(true){
	  try {
		  System.out.println(i/b);
	
	  }
	  catch(Exception e) {
		  System.out.println(" division notpossible by 0");
		  
	  }
	  finally {
		  System.out.println("Looop complete");         // finally block is always executed in any condition wheter exceptin handled or not.
	  }
	
	break;
  }
}
	public static void main(String[] args) {
		m1();
	}
}