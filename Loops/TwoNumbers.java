public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22

        // Print the result of 13 substracted from 22

        // Print the result of 22 multiplied by 13

        // Print the result of 22 divided by 13 (as a decimal fraction)

        // Print the integer part of 22 divided by 13

        // Print the remainder of 22 divided by 13

        int a, b;
        a = 13; b = 22;

        int result = b - a;
        double zlomek = b / a;

        System.out.println( b + result );

        System.out.println( b - a );

        System.out.println( a * b );

        System.out.println(zlomek);

        System.out.println(b % a);



    }
}
