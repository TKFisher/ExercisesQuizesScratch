package Examples;

import java.util.Scanner;

public class ScannerExamples {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a int below: ");
        int userInputInt = scan.nextInt();
        System.out.println("See my 'int': " + userInputInt);

        System.out.println("Enter a double below: ");
        double userInputDouble = scan.nextDouble();
        System.out.println("See my double: " + userInputDouble);
/*
https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-nextint-or-other-nextfoo
*/
        System.out.println("Enter a string below: ");
        scan.nextLine();    // Firing a blank to fix String skipping issue.
        String userInputString = scan.nextLine();
        System.out.println("See my 'String': " + userInputString);

        System.out.println("Enter a 'true' or 'false'.");
        Boolean userInputBoolean = scan.nextBoolean();
        System.out.println("See my bool: " + userInputBoolean);




    }

}
