package ch5Project;

import java.util.Scanner;

class Name {
    private int id;
    private String name;

    public void count(String name) {
        this.name = name;
        this.id++;
    }

    public String randomName() {
        String temp = null;
        if (this.id >= 1) {
            int random = (int) (Math.random() * this.id) + 1;
            for (int i = 1; i <= this.id; i++) {
                if (random == i) {
                    temp =  this.name;
                }
            }
        }

        return temp;
    }

}

public class NameRandom {
    public static void main(String[] args) {
        Name randomName = new Name();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name");
            String name = input.next();
            randomName.count(name);
            System.out.println("Do you want to continue yes or no");
            if (input.next().equalsIgnoreCase("no")) {
                break;
            }
        }
        String finalResult = randomName.randomName();
        System.out.println("Random name is " + finalResult);
    }
}
