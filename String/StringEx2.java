package String;

public class StringEx2 {
	
	private StringEx2()   //Private constructer 
	{
		
	}
	private static StringEx2 AA = new StringEx2();
		
	public static StringEx2 GetAA()
	{  
		String txt = "HJiiiii   Swapnil";
	    String txt2 = " how are you";
	    
		System.out.println("For calculating lenght"+txt.length());
		System.out.println("For Upper And Lower case "+ txt.toUpperCase()+" "+txt.toLowerCase());
		System.out.println("Finding caracter in string"+ txt.indexOf("S"));
		System.out.println(" For concate tro string"+txt.concat(txt2));
		return AA;
	}

	}



