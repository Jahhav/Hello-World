import java.util.Arrays;

public class kinorandomtry {

    public static void main(String[] args) {

        String [][][] kino = new String [3][10][10];

        kino[2][4][5] = "Petr";
        kino[2][1][4] = "Veverka";

        for (int sal = 0; sal < kino.length; sal++){
            String [][] vSalu = kino[sal];
            for (int rada = 0; rada < vSalu.length; rada++){
                for (int sedadlo = 0; sedadlo < vSalu[rada].length; sedadlo++){
                    String divak = vSalu[rada][sedadlo];
                    System.out.print((divak != null ? divak: "-") + " | ");
                }
                System.out.println();
            }
            System.out.println("--------------");
        }
        int [] test = {1,2,3};
        System.out.println(test);
    }
}
