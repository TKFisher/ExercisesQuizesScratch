package Examples;

public class IncrementationExamples {

    public static void main(String[] args) {

        int x = 10;

        System.out.println("Example of post incrementation.");
        System.out.println(x++);   // x = x + 1
        System.out.println(x);

        System.out.println("Example of pre incrementation.");
        System.out.println(++x);
        System.out.println(x);

        System.out.println("Example of adding and subtracting to 'y'.");
        int y = 10;
        y += 5;                 // y = y + 5
        System.out.println(y);
        y -= 2;
        System.out.println(y);

        System.out.println("Example of multipling and dividing to 'z'.");
        int z = 10;
        z *= 3;                 // z = z * 3
        System.out.println(z);
        z /= 5;
        System.out.println(z);

    }
}
