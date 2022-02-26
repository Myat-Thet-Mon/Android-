package ch4Exercise;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter original number of blocks");
        int block = input.nextInt();
        int oriBlock = block;
        while (oriBlock <= block) {
            System.out.println("Enter uncompressed size of a file");
            int size = input.nextInt();
            int requiredBlock = size / 512;
            System.out.println("Required Blocks :" + requiredBlock);
            int compressedSize = size * 80/ 100;
            System.out.println("Compressed size :" + compressedSize);
            oriBlock = oriBlock - requiredBlock;
            System.out.println("The available space is now :" + oriBlock);
        }
    }
}
