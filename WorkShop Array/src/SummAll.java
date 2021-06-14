import java.util.stream.IntStream;

public class SummAll {
    public static void main(String[] args) {

        // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements of `numbers`

        int numbers [] = {3, 4, 5, 6, 7};
        int sum = IntStream.of(numbers).sum();

        System.out.println("The sum is: " + sum);



    }
}
