package DesignPattern;

public class SingletonClassEx1
{
	private SingletonClassEx1()
	{
		// Cunstructer  to avoid client application to use constructer private
	}
	
	private static SingletonClassEx1 AA = new SingletonClassEx1();    // object of class AA created.
	
	
	public static SingletonClassEx1 getAA()    // method returning datatype SingletonClassEx1 classname
	{
		for(int i=1;i<=10;)
		{
			System.out.println(i);
			i++;	
		}
		return AA;
	}

}
