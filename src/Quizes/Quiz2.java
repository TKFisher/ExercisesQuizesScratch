package Quizes;

public class Quiz2 {

    public static void main(String[] args) {

        String s1 = "sololearn";
        String s2 = "SoloLearn";
        String s3 = s1;

        // Which result in a True statement.
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s1));

    }
}
