package Thread;
public class Thread2 implements Runnable{
    String name;
    
    public Thread2(String name){
        this.name=name;
    }
    
    @Override
    public void run() {
        for(int i=0;i<10;i++){       
            System.out.println(this.name+"-"+i);
        }
    }
    
    public static void main(String[] args) {
       Thread2 t1 = new Thread2("One");
       Thread2 t2 = new Thread2("Two");
       
       Thread th1 = new Thread(t1);
       Thread th2 = new Thread(t2);
       
       th1.start();
       th2.start();
    }

         
}
