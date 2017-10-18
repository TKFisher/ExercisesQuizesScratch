package Examples;

/*
*
*  The code in a finally block will take precedence over the return statement.
*
*  The finally block will not be called after return in a couple of unique scenarios:
*  if System.exit() is called first, or if the JVM crashes.
*
* */

public class TryCatchFinallyWithMultipleReturns {

    public static void main(String[] args) {

        System.out.println(getValue());
    }

    public static int getValue() {
        try {
            //System.exit(0);
            System.out.println("Try Block");
            return 1;

        } catch (RuntimeException e) {
            System.out.println("Catch Block");
            return 2;
        } finally {
            //System.exit(0);
            System.out.println("Finally block");
            return 3;
        }
    }
}
