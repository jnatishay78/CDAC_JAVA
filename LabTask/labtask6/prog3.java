package labtask6;
class Bank {
    int getBalance() {
        return 0;
    }
}
class BankA extends Bank {
    @Override
    int getBalance() {
        return 10000;
    }
}
class BankB extends Bank {
    @Override
    int getBalance() {
        return 15000;
    }
}
class BankC extends Bank {
    @Override
    int getBalance() {
        return 2000;
    }
}

public class prog3 {
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        System.out.println("Balance in Bank A: Rs " + bankA.getBalance());
        System.out.println("Balance in Bank B: Rs " + bankB.getBalance());
        System.out.println("Balance in Bank C: Rs " + bankC.getBalance());
    }
}
