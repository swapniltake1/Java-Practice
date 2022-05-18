package DesignPattern;

public class FactoryD
 {
	FactoryD()
	{
		// Constructor created
	}
 
   public static Calculator getFactor(String num)     // Static method name getfactor() and method datatype is Calculator.
   {
	   Calculator ob=null;                      // In this method calculator ob is assigned to null value for default.
	   
	   if(num.equals("+"))
	   {
		   ob = new Addition();     // If else condition is used 
	   }
	   else if(num.equals("-"))      // If else condition is used 
	   {
		   ob = new substarct();
	   }
	   else if(num.equals("*"))    // If else condition is used 
	   {
		   ob = new multiply();
	   }
	   else if(num.equals("/"))    // if else condition used.
	   {
		   ob = new Div();
	   }
	   return ob;
   }
 }