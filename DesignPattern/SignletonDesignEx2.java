package DesignPattern;

public class SignletonDesignEx2 {
    private static SignletonDesignEx2 SignletonDesignEx2;
	private SignletonDesignEx2()
	{
		
	}
	
	public static SignletonDesignEx2 m1()
	{
	     System.out.println("  hiii there this id singleton classssssdsd   ");
	    	 return SignletonDesignEx2;
	}
	
}
