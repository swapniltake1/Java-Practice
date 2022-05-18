package oop;

public class InheritanceEx31 extends InheritanceEx3
{
public void m2()
{
	int a=50;int b=55;
	System.out.println(a+b);
}

public static void main(String[] args) {
	
	InheritanceEx31 inheritanceex31 = new InheritanceEx31();
	inheritanceex31.m1();
	inheritanceex31.m2();
}
}
