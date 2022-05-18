package Interface;

public interface InterfaceEx2

{  
float rateOfInterest();  
}  

class SBI implements InterfaceEx2

{  
public float rateOfInterest()
{
	return 9.15f;
	}  
}  

class PNB implements InterfaceEx2

{  
public float rateOfInterest()
{
	return 9.7f;
	}  
}  

class TestInterface2
{  
public static void main(String[] args)
{  
	InterfaceEx2 b=new SBI();  
System.out.println("ROI: "+b.rateOfInterest());  
}
}  