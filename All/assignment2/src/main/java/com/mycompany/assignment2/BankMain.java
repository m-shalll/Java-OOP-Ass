package com.mycompany.assignment2;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class BankMain {
    public static void main(String[] args){
        int counter=0;
        int amount;
        int balance;
        String username;
        int accountNumber;
        BankAccount account;
        List<BankAccount> users=new ArrayList<>();
        while(true){
            System.out.println("Choose your option:");
            System.out.println("N:New account \n"
                    + "B: Check balance \n"
                    + "D:Deposit\n"
                    + "W:Withdraw");
            Scanner scan=new Scanner(System.in);
            String choice=scan.nextLine();
            if("N".equals(choice)){
                System.out.print("Enter your name: ");
                username=scan.nextLine();
                users.add(new BankAccount(counter,username));
                System.out.println("Your account has been created and your account number is: "+counter);
                counter++;
            }
            else if("B".equals(choice)){
                System.out.print("Enter your account number: ");
                accountNumber=scan.nextInt();
                account=users.get(accountNumber);
                balance=account.checkBalance(account);
                System.out.println("Your current balance is: "+balance);
            }
            else if("D".equals(choice)){
                System.out.print("Enter your account number: ");
                accountNumber=scan.nextInt();
                System.out.print("Enter the amount you want to deposit: ");
                amount=scan.nextInt();
                account=users.get(accountNumber);
                account.deposit(amount);
                System.out.println("The amount of: "+amount+" has been added to your account");
            }
            else if("W".equals(choice)){
                System.out.print("Enter your account number: ");
                accountNumber=scan.nextInt();
                System.out.print("Enter the amount you want to deposit: ");
                amount=scan.nextInt();
                account=users.get(accountNumber);
                account.withdraw(amount);
                
            }
        }
    }
}
