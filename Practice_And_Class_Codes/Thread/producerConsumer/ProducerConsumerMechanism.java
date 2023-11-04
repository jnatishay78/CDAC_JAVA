package Thread.producerConsumer;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

class Producer implements Runnable{
    private final Vector buffer;
    private final int SIZE;

    public Producer(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }
    
    public void Produce(int i) throws InterruptedException{
        if(buffer.size()==SIZE){
            synchronized(buffer){
                System.out.println("The Buffer is Full and waiting to consume items "+buffer.size());
                buffer.wait(); //Blocked Production
            }
        }
        synchronized(buffer){
            buffer.add(i);
            buffer.notifyAll(); //UnBlocked Consumer
        }
    }
    @Override
    public void run() {
        for(int i=1;i<10;i++){
            try {
                Produce(i);
            } catch (Exception e) {}
            System.out.println("Produced item "+i);
        }
    }
}


class Consumer implements Runnable{
    private final Vector buffer;
    private final int SIZE;

    public Consumer(Vector buffer, int SIZE) {
        this.buffer = buffer;
        this.SIZE = SIZE;
    }
 
    public int Consume() throws InterruptedException{
        if(buffer.isEmpty()){
           synchronized(buffer){ 
             System.out.println("The buffer is Empty and waiting to produce items "+buffer.size());
             buffer.wait(); //Blocked Consumer
            }
        }   
           synchronized (buffer) {
              buffer.notifyAll(); //Unblocked Producer
              return (Integer)buffer.remove(0); 
           }
    }
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Consumed Items "+Consume());
            }catch(Exception e){}
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }
}
public class ProducerConsumerMechanism {
    public static void main(String[] args) {
        Vector buff = new Vector();
        int SIZE=5;
        
        Producer p = new Producer(buff, SIZE);
        Consumer c = new Consumer(buff, SIZE);
        
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        
        t1.start();
        t2.start();
    }
}
