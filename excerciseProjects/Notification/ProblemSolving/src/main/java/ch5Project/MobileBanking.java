package ch5Project;

import java.util.Scanner;

class BankAccount {
    private String accountName;
    private int id;
    private String address;
    private int phNo;
    private double oriAmount = 0;

    public void transferFromOther(BankAccount otherAccount, double amount) {
        this.oriAmount += amount;
        otherAccount.oriAmount -= amount;
    }

    /**
     * if driver enter amount that exceeded the original amount,this method return -1 that means your amount had no enough money to transfer
     *
     * @param amount
     * @return
     */
    public void sentAmountToOther(BankAccount other, double amount) {
        if (amount > this.oriAmount) {
           throw new RuntimeException("error");
        } else {
            this.oriAmount=this.oriAmount - amount;
            other.oriAmount+=amount;
        }
    }

    public void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account name");
        this.accountName = input.nextLine();
        System.out.println("Enter your address");
        this.address = input.nextLine();
        System.out.println("Enter your ph no");
        this.phNo = input.nextInt();
        this.id++;
    }

    public void outputAccountInfo() {
        System.out.println("Your account is :");
        System.out.println("ID :" + this.id);
        System.out.println("Name :" + this.accountName);
        System.out.println("Address :" + this.address);
        System.out.println("Phone No :" + this.phNo);
        System.out.println("Amount :" + this.oriAmount);
    }
}

public class MobileBanking {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2=new BankAccount();
        bankAccount1.readInput();
        bankAccount2.readInput();
        bankAccount1.outputAccountInfo();
        bankAccount2.outputAccountInfo();
        bankAccount1.transferFromOther(bankAccount2,5000);
        bankAccount1.sentAmountToOther(bankAccount2,3000);
        bankAccount1.outputAccountInfo();
        bankAccount2.outputAccountInfo();

    }
}