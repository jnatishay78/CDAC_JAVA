/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask21;

/**
 *
 * @author user
 */
public class EXER5_Account {
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
