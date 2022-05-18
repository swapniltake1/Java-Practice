package Multi_threading;

public class Demo implements Runnable
{

    public void run()
	 { 
	for(int i=1; i<=5; i++)
	{
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("main Job : " +i);
	}
	 }
}

