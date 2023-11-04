package overloading;
class Account{
    int accNo;
    String accType;
    
    public Account(int an){
        accNo=an;
        accType="Saving";
    }
    
    public Account(int accNo, String accType){
        this.accNo= accNo;
        this.accType = accType;
    }
    
    void displayInfo(){
        System.out.println("Your Account Number is "+accNo+" and belongs to "+accType+" account category");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Account acc = new Account(1110022);
        acc.displayInfo();
        
        Account acc1 = new Account(1110022,"Current");
        acc1.displayInfo();
    }
}
