package Exception_Handling;

import java.util.Scanner;

public class Assignment
{
	public static void main(String[] args) {
		
	
  boolean flag=true;
  int [] marks= new int [10];
  marks[0]=10;
  marks[1]=15;
  marks[2]=20;
  marks[3]=16;
  marks[4]=19;
  marks[5]=22; 
  marks[6]=18;
  marks[7]=28;
  marks[8]=30;
  marks[9]=26;
 
  Scanner sc=new Scanner(System.in);
  int index;
  int i=0;
  while(flag && i<5)
  try{
	  System.out.println("Enter the value of your marks");
        index=sc.nextInt();
        System.out.println("The value of index is  " +marks[index]);
        break;
  }
  catch(Exception e) {
	  System.out.println("Invalid index please try again ");
	  i++;
  }

  if(i>=5) {
	  System.out.println("Maximum retry unsuccesfull ");
	  System.out.println("End of the programmmm ");

	  

  }
}
}