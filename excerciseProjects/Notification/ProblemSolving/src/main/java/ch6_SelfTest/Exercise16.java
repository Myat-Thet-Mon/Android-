package ch6_SelfTest;

class SavingsAccount1 {
    private double balance;
    public static double interestRate = 0;
    public static int numberOfAccounts = 0;

    public SavingsAccount1() {
        balance = 0;
        numberOfAccounts++;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount)
            balance = balance - amount;
        else
            amount = 0;
        return amount;
    }

    public static void addInterest() {
        SavingsAccount1 obj = new SavingsAccount1();
        double interest = obj.balance * interestRate;
        obj.balance = obj.balance + interest;
    }

    public double getBalance() {
        return balance;
    }

    public static void showBalance(SavingsAccount1 account) {
        System.out.print(account.getBalance());
    }
}

public class Exercise16 {
    public static void main(String[] args) {
        SavingsAccount1.setInterestRate(0.01);
        SavingsAccount1 mySavings = new SavingsAccount1();
        SavingsAccount1 yourSavings = new SavingsAccount1();
        System.out.println("I deposited $10.75.");
        mySavings.deposit(10.75);
        System.out.println("You deposited $75.");
        yourSavings.deposit(75.00);
        System.out.println("You deposited $55.");
        yourSavings.deposit(55.00);
        double cash = yourSavings.withdraw(15.75);
        System.out.println("You withdrew $" + cash + ".");
        if (yourSavings.getBalance() > 100.00) {
            System.out.println("You received interest.");
            yourSavings.addInterest();
        }
        System.out.println("Your savings is $" +
                yourSavings.getBalance());
        System.out.print("My savings is $");
        SavingsAccount1.showBalance(mySavings);
        System.out.println();
        int count = SavingsAccount1.getNumberOfAccounts();
        if (mySavings.getBalance() > 100.00) {
            System.out.println("You received interest1.");
            mySavings.addInterest();
        }
        System.out.println("We opened " + count +
                " savings accounts today.");
       // SavingsAccount1.addInterest();
       // System.out.println("Your balance :" + mySavings.getBalance());
    }
}
