package Thread.synchronization;

import java.util.Scanner;

public class Customer implements Runnable{
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        synchronized (account) {
        System.out.print(name+" Please Enter Amount to Withdrawal: ");
        int amount = sc.nextInt();
        
        if(account.isSufficientBalance(amount)){
            System.out.println(this.name+ " is going to withdraw INR "+amount+" /-");
            account.withDraw(amount);
        }else{
            System.out.println("Insufficient Balance....");
        }
        }
    }
}
