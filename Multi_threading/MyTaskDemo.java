package Multi_threading;

public class MyTaskDemo {
 public static void main(String[] args) {
	Thread t1=Thread.currentThread();
	System.out.println(" Name : "+t1.getName());
	t1.setName("Active Thread");
	System.out.println(" Name : "+t1.getName());
	
	System.out.println(" Priority : "+t1.getPriority());
	MyTask t11=new MyTask();
	t11.start();
	for(int i=1; i<=5; i++)
	{
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(" MAin : " +i);
}
}
}
