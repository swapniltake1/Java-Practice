public class MyThreads implements Runnable {

    private int start;
    private int end;

    
    public MyThreads(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    public void run() {
        
         for(int i= start; i< end; i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
             
            try {
                Thread.sleep(100);
                System.out.println("thread sleeping for 100ms");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        
        }
    }

}