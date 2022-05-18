package Exception_Handling;

public class Finanlly {
	
 public static int m1()
 {
	 int a=10;
	 int b=5;
	 int c;
	 try {
		 c=a/b;
		 System.out.println(c);
	 }
	 catch(Exception e) {
		 System.out.println("this value not divided by zero");
	 }
	 
	 finally{
		 System.out.println("End of the programmmm");
		 
	 }
	return 0;
 }
 
 public static void main(String[] args) {
	m1();
}

}
