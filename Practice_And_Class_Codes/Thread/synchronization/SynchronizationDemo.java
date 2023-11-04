package Thread.synchronization;
public class SynchronizationDemo implements Runnable{
    static int x=0;
    @Override
    public void run() {
        synchronized(this){
            for(int i=0;i<1000;i++){
                x++;
                x--;
            }
        }
    }
    
    public static void main(String[] args) {
        SynchronizationDemo sd = new SynchronizationDemo();
        
        Thread th[] = new Thread[100];
        for(int i=0; i<th.length; i++){
            th[i]=new Thread(sd);
            th[i].start();
        }
        System.out.println("Final Value of x is "+x);
    }
}
