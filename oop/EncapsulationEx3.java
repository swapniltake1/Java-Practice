package oop;

public class EncapsulationEx3 
{
 private void m1()
 {
	 String s= "Swapnil    bduasfz";
	 System.out.println("Encapsulated method ");
	 System.out.println(s);
	 
 }
 public void m2()
 {
	 System.out.println("Public method      ");
	 m1();
 }
 
 public class M1
 {
	 public static void main(String[] args) {
		 EncapsulationEx3 AA=new EncapsulationEx3();
		 AA.m2();
		
	}
 }
 
}
