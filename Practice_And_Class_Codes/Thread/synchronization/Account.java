package Thread.synchronization;
public class Account {
    private int balance=10000;
    
    public boolean isSufficientBalance(int amount){
        if(balance<amount){
            return false;
        }else{
            return true;
        }
    }
    
    
    public void withDraw(int amount){
        balance=balance-amount;
        System.out.println("Remaining Balance is INR "+balance+" /- ");
    }
    
}
