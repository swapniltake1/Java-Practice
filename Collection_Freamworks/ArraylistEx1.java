package Collection_Freamworks;

import java.util.*;

public class ArraylistEx1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> L1= new ArrayList<>();
	
	L1.add(50);     
	L1.add(100);
	L1.add(150);
	L1.add(200);
	L1.add(250);   // ADDD METHOD FOR ADDING ELEMENT IN ARRAYLIST
	L1.add(300);
	L1.add(350);
	L1.add(400);
	L1.add(450);
	L1.add(500);
	
	ArrayList<Integer> L2= new ArrayList<>();
	
	L2.add(00);     
	L2.add(00);
	L2.add(50);
	L2.add(200);
	L2.add(200);
	L2.add(00);
	L2.add(30);
	L2.add(400);
	L2.add(450);
	L2.add(500);
	
	L1.addAll(L2);
	
	
	
	for(int i=0; i<L1.size(); )     //// Printing Statement using for loop.
	{
		System.out.println(L1.get(i));
		i++;
	}
		
	}

	private static ArrayList<Integer> addall(ArrayList<Integer> l2) {
		// TODO Auto-generated method stub
		return null;
	}

}
