package oop;

public class Additionex1Polymorphism    // polymorphism - method overloading.
{ 
		static int add(int a, int b)   // Static method add is example of overloading in this example both methods have same method name 
		{                              // but have diffrent datatypes int and double.
		return a+b;  
		}
		
		static double add(double a, double b)
		{
		return a+b;
		}
		
		public static void main(String[] args)   // main method 
		{  
			
		System.out.println(Additionex1Polymorphism.add(11,11));  
		System.out.println(Additionex1Polymorphism.add(12.3,12.6));  
		
		}  
}
