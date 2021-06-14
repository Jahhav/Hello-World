public class ff {
    public static void main(String[] args) {

        int[] someArray = new int[10];

        //  .length = 3   --> 0  1  2
        int[] definedArray = {0, 0, 0, 0};
        for (int i = definedArray.length - 1; i >= 0; i--) {
            System.out.print(definedArray[i] + " ");
            for (int j = 0; j < i; j--){
                System.out.println(5);
            }
        }
//        System.out.println();

//        for (int element :  definedArray ) {
//            System.out.print(element + " ");
//        }
//        System.out.println();


    }
}
