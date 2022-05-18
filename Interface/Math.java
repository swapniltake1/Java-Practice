package Interface;


	class math implements interfaceEx3 , InterfaceEx4 , InterfaceEx1     // implementing both interface.
	{
		// int a=1; int b=5;
		public int Add()
		{
			System.out.println("addtion of two number is =" + (a+b));
			return a+b;
		}
		public int Multiply()
		{
			System.out.println("Multiplication of two number is =" + (a*b));
			return a*b;
		}
		public int division()
		  {
			  System.out.println("division of two number is ="  + (a/b));
			  return a/b;
		  }
		  public int substract()
		  {
			  System.out.println("sustraction of two number is =" +  (a-b));
			  return a-b;
		  }
		  
		  public int min() {
			    System.out.println("min of c and d is =" +(c < d) );
			    return d;
		  }
		  
		 public void print()
		 {                                                        //  other page of programming in this package method of interface is calling in programm.
			 System.out.println("hiiii   am other ");
		 }
		  
			  
		  
		  public static void main(String[] args) {
			   math obj = new math();
			  obj.Add();
			  obj.division();
			  obj.Multiply();   //  calling by class objects both of interfaces methods 
			  obj.substract();
			  obj.min();
			  obj.print();
			  
			  
		}
	}


