package Examples;

import java.util.Scanner;

/*
*  Task:
*  Given a single integer, N , print its first multiples.
*  Each multiple N x i (where 1 <= i <= 10 )should be printed on a new line
*  in the form: N x i = result.
*
*  Output format:
*  Print lines of output; each line i (where 1 <= i <= 10 ) contains the of N x i in the form:  N x i = result.
*
* */


public class Loop1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a whole number.");
        int N = in.nextInt();
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
