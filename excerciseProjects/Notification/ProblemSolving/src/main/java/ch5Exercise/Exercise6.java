package ch5Exercise;

import java.util.Scanner;

public class Exercise6 {
    int soldNumber;
    int totalSales;
    int totalDiscount;
    int costPerItem;
    int quantity;
    int discount;

    public void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter soldNumber");
        int soldNumber = input.nextInt();
        this.soldNumber = soldNumber;
        System.out.println("Enter total sales");
        int totalSales = input.nextInt();
        this.totalSales = totalSales;
        System.out.println("Enter total discount");
        int totalDiscount = input.nextInt();
        this.totalDiscount = totalDiscount;
        System.out.println("Enter costPerItem");
        int costPerItem = input.nextInt();
        this.costPerItem = costPerItem;
        System.out.println("Enter quantity");
        int quantity = input.nextInt();
        this.quantity = quantity;
        System.out.println("Enter discount");
        int discount = input.nextInt();
        this.discount = discount;
    }

    public void registerSale(int n) {
        if (n > this.quantity) {
            this.costPerItem = this.costPerItem - discount;
            System.out.println(this.costPerItem);
        }
    }

    public void displaySales() {
        System.out.println(this.soldNumber);
        System.out.println(this.totalSales);
        System.out.println(this.totalDiscount);
    }

    public static void main(String[] args) {
        Exercise6 obj = new Exercise6();
        Scanner input = new Scanner(System.in);
        obj.readInput();
        System.out.println("Enter number");
        int n = input.nextInt();
        obj.registerSale(n);
        obj.displaySales();
    }
}
