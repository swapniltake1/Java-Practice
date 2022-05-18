package oop;

public class blocks {
	
	blocks()                                         // cunstructer
	{                                                // same name as class name
		System.out.println("hey am cunstructer");    // automatically called when object created.
	}                                                // called before all of methods.
	
    static                                          // Static block
    {                                               // automatically called when we compile program.
    	System.out.println("hey am static block");  // exicute 1st in all of methods and all other like cunstructer etc.
    }
    
    // init block                                   // init block 
    {                                               // called automatically when object is created.
    	System.out.println("hey am init block");    // init block only needs two curly bracket.
    }
}
