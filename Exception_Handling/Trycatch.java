package Exception_Handling;

import java.util.Scanner;

public class Trycatch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      
	  
      
      Scanner Sc1 = new Scanner(System.in);
      System.out.println("Enter First Number");             /////  Take input from user  
      int a = Sc1.nextInt();      // Storing into veriable
      
      Scanner Sc2 = new Scanner(System.in);
      System.out.println("Enter Secoend Number");
      int b = Sc2.nextInt();
     
      try {                                                 /// try block for an Exception
    	  int c=a/b;                                       // operation
        System.out.println("The result is    " +c );         //  Result
      }
      catch(Exception e)     // if Exception occurd catch block will catch the exception and print it, otherwise printing result
      {
    	  System.out.println("  We fail to devide:  Reason :");
    	  System.out.println(e);
      }
	}

}
