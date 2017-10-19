package Scratch1;

import java.util.Scanner;

public class Scratch1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter int value 1 here: ");
        int value1 = scan.nextInt();

        System.out.println("Enter int value 2 here: ");
        int value2 = scan.nextInt();

        if (value1 > value2) {
            System.out.println("Value 1 is greater than value 2.");
        } else if (value1 < value2) {
            System.out.println("Value 1 is less than 2. ");
        } else {
            System.out.println("Value 1 and 2 are equal.");
        }
    }
}
