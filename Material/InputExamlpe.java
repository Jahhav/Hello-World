import java.util.Scanner;

public class InputExamlpe {

    public static void main(String[] args) {
        int a, b;
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter positive A: ");

        a = keyboardInput.nextInt();

        System.out.println("Enter B that is not zero: ");

        b = keyboardInput.nextInt();
//        if (a <= 0) {
//            System.out.println("A cannot be zero or negative number.");
//        } else if (b == 0) {
//            System.out.println("B cannot be zero");
//        } else {
//            System.out.println("Sum A + B is: " + (a / b));
//        }

        boolean isAPositive = a > 0; //boolean true/false
        boolean isVNonZero = b != 0;

        if (a > 0 && b != 0) {
            System.out.println("Sum A + B is: " + (a / b));
        } else {
            if (isVNonZero)
                System.out.println("A cannot be zero or negative number.");
            System.out.println();
            else
            System.out.println("B cannot be zero.");
            System.out.println("I cannot divide by zero");
        }
    }
}
