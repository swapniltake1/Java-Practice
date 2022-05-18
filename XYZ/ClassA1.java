package XYZ;

public class ClassA1 implements  InterfaceA1
{
	

	@Override
	public void m1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
	}

	@Override
	public void m2() 
	{
		int i=1;
	 System.out.println(i);
	 i++;
	 while(i<5);
		
	}

	@Override
	public void M3()
	{
		int i=1;
		int j=10;
		do{System.out.println(i);
			i++;
			}
			while(i<j);	
	}

	@Override
	public void m4() 
	{
		int i=10;
	  System.out.println(i);
		
	}

	@Override
	public void m5() {
		
		 System.out.println("hiiiiiii am method m5");
			
		
	}

}
