package com.mycompany.assignment2;

public class BankAccount {
    private final int accountNumber;
    private final String userName;
    private int current;
    public BankAccount(int accountNumber,String userName){
        this.accountNumber=accountNumber;
        this.userName=userName;
        this.current=0;
}
    public int checkBalance(BankAccount account){
        return(account.current);
    }
    public void deposit(int amount){
        if(amount<=0){
            System.out.println("Please try again and enter an egligible amount");
        }
        else{
            this.current=this.current+amount;
        }
    }
    public void withdraw(int amount){
        if(amount<=0){
            System.out.println("Please try again and enter an egligible amount");
        }
        else if(amount>this.current){
            System.out.println("Please try again and enter an amount less than your current balance");
        }
        else{
            this.current=this.current-amount;
            System.out.println("The amount of: "+amount+" has been withdrawn from your account");
        }
        
    }
}
