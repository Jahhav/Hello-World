import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {

        // - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`

        String orders [] = {"first", "second", "third"};

        System.out.println("Before: " + Arrays.toString(orders));

        System.out.println("---------------------------");


        String c = orders[0];
        String d = orders[2];
        orders[2] = c;
        orders[0] = d;



        System.out.println("After: " + Arrays.toString(orders));

    }
}
