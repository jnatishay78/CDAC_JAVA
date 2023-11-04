package labtask21;
import Thread.synchronization.Account;
import Thread.synchronization.Customer;
public class EXER5_Bank {
    public static void main(String[] args) {
        
        Account acc = new Account();
        
        EXER5_Customer c1 = new EXER5_Customer("Mrs. Laveena",acc);
        EXER5_Customer c2 = new EXER5_Customer("Mrs. Purti",acc);
        
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        
        t1.start();
        t2.start();
    }
}
