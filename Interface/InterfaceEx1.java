package Interface;

public interface InterfaceEx1
{  
	void print();           // Interface have multiple abstract methods without body
	
	}  


	class Interface implements InterfaceEx1    // we can access interface using keyword "Implements"
	{  
	public void print()                       // then we have to modify methods body which are defined in interface.
	{                                           // it is compulsary to make methods public when we madifying methods in class.
		System.out.println("Hello");
		}  
	  
	
	
	public static void main(String args[])     // main method .
	{  
		Interface obj = new Interface();    // creating object of class and calling method from interfaces.
	obj.print();  
	 }  
	}  
	


