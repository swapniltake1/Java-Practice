public class ThreadDemo {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThreads(1, 5));
        Thread thread2 = new Thread(new MyThreads(5, 10));
        System.out.println("starting thread 1");
        thread1.start();
           System.out.println("starting thread 2");
        thread2.start();

        try {
            System.out.println("Joininng 2 Thread ::");
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Execution completed.");
    
    }
}
