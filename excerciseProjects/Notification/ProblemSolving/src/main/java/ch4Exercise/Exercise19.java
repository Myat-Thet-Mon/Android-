package ch4Exercise;

/*
int
int
int
for
sum = 0;
product = 1;
max = 20;
(int i = 1; i <= max; i++)
sum = sum + i;
product = product * i;
System.out.println("The sum is " + sum +
" and the product is " + product);
 */
public class Exercise19 {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        int max = 20;
        for (int i = 1; i <= max; i++) {
            sum = sum + i;
            product = product * i;
            System.out.println("The sum is " + sum +
                    " and the product is " + product);
        }
    }
}
