package Multi_threading;

public class MyTask extends Thread {
	public void run()
	{
		for(int i=1;i<=5; i++ )
		{
	try {
		Thread.sleep(500);
		}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
   System.out.println("Thread : "+i);
}
}
}

