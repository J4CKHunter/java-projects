public class Chronometer implements Runnable{

    private Thread thread;
    private String threadName;

    public Chronometer(String threadName){ this.threadName = threadName;}

    @Override
    public void run() {
        System.out.println("running");

        try{
            for(int i = 0; i < 10; i++ ){
                System.out.println(threadName + " : " + i );
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            System.out.println("thread ended");
        }
    }

    public void start(){
        System.out.println("thread starting");
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
