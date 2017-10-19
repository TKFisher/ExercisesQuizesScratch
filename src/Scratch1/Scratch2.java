package Scratch1;

import java.util.Scanner;

public class Scratch2 {

    public static void main(String[] args) {

        double amount = 0;
        double interestRate = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount.");
        amount = scan.nextDouble();
        System.out.println ("Enter interest rate. ");
        interestRate = scan.nextDouble();

        System.out.println("Your interest rate based on " + amount + " x " +
                interestRate + " is " + calculateInterestRate(amount, interestRate));
        
    }

    public static double calculateInterestRate (double amount, double interestRate){
        return (amount * (interestRate/100));
    }


}
