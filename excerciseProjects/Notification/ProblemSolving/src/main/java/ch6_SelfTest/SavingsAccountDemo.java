package ch6_SelfTest;

class SavingsAccount {
    private double balance;
    public static double interestRate = 0;
    public static int numberOfAccounts = 0;

    public SavingsAccount() {
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

    public void addInterest() {
        double interest = balance * interestRate;
        balance = balance + interest;
    }

    public double getBalance() {
        return balance;
    }

    public static void showBalance(SavingsAccount account) {
        System.out.print(account.getBalance());
    }
}

public class SavingsAccountDemo {
    public static void main(String[] args) {
        SavingsAccount.setInterestRate(0.01);
        SavingsAccount mySavings = new SavingsAccount( );
        SavingsAccount yourSavings = new SavingsAccount( );
        System.out.println("I deposited $10.75.");
        mySavings.deposit(10.75);
        System.out.println("You deposited $75.");
        yourSavings.deposit(75.00);
        System.out.println("You deposited $55.");
        yourSavings.deposit(55.00);
        double cash = yourSavings.withdraw(15.75);
        System.out.println("You withdrew $" + cash + ".");
        if (yourSavings.getBalance() > 100.00)
        {
            System.out.println("You received interest.");
            yourSavings.addInterest();
        }
        System.out.println("Your savings is $" +
                yourSavings.getBalance());
        System.out.print("My savings is $");
        SavingsAccount.showBalance(mySavings);
        System.out.println();
        int count = SavingsAccount.getNumberOfAccounts();
        System.out.println("We opened " + count +
                " savings accounts today.");
    }
}
