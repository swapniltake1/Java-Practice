package Multi_threading;

public class DemoJob {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Demo j=new Demo();
     Thread t1=new Thread(j);
     t1.start();
     
     for(int i=1;i<=5; i++)
     {
    	try {
    		Thread.sleep(500);	 
    	 } catch (InterruptedException e)
    	{
    		 e.printStackTrace();
    	}
    	System.out.println(" Main : "+i);
     }
	}

}
