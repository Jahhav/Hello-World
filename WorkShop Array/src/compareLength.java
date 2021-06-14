public class compareLength {

    public static void main(String[] args) {

        // - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`
// - Otherwise print: "firstArrayOfNumbers is the longer one"

        int [] fistArrayOfNumbers = {1, 2, 3};

        int [] secondArrayOfNumbers = {4, 5};

                if (secondArrayOfNumbers.length > fistArrayOfNumbers.length){
                    System.out.println("SecondArrayOfNumbers is longer!");
                }
                else System.out.println("firstArrayOfNumbers is the longer one");

    }
}
