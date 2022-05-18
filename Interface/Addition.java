package Interface;

public class Addition implements Calculator
{

	@Override
	public String services(int a, int b)
	{
		//System.out.println(a+b);
		// return String.valueOf(a+b);         // returning addition of a, b  and converting int to string.
	     int c=a+b;
		return "  " +c;
		
		
		
	}
}