package lambdaexpresssion;

import java.util.logging.Level;
import java.util.logging.Logger;

@FunctionalInterface
interface LengthFinder{
    int strLength(String str);
}


public class TestLambdaExpression {
    public static void main(String[] args) {
        LengthFinder lf = (str)->str.length();
        System.out.println("Length of given String: "+lf.strLength("LAVISHAY"));
        
        //using lamba expression
        Runnable r = ()->{
            for(int i=0;i<10;i++){
               System.out.println("i: "+i);
            try {
                   Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestLambdaExpression.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
};
        //using annonymous class
        Runnable r1= new Runnable(){
        public void run(){
         for(int i=0;i<10;i++){
               System.out.println("Anonymous i: "+i);
            try {
                   Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestLambdaExpression.class.getName()).log(Level.SEVERE, null, ex);
                }
         }
    }
    };
        r.run();
        r1.run();
}
}
