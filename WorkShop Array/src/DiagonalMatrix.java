import java.lang.reflect.Array;

public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create a two dimensional array dynamically with the following content.
        //   Note that a two dimensional array is often called matrix if every
        //   internal array has the same length.
        //   Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        //   Its length should depend on a variable
        //
        // - Print this two dimensional array to the output

        int [][] table = new int [5][5];
        int row;
        int column = 0 ;

        for (row = 0; row < table.length; row++) {

            for (column = 0; column < table[row].length; column++) {
                if (row == column)
                    table[row][column] = 1;
                else
                    table[row][column] = 0;
            }
        }


        for (row = 0; row < table.length; row++){
            for (column = 0; column < table[row].length; column++){
                System.out.print(table[row][column]);
            }
            System.out.println();
        }



    }
}
