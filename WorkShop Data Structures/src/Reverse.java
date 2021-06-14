public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String which is passed as parameter
        // Pass the toBeReversed variable to this method to check if it works well
        // Solve this task using charAt() function first
        // Try other solutions when you are done

        System.out.println(reverse(toBeReversed));
    }

    public static String reverse(String s){

        char[] letters = new char[s.length()];
        int letterIndex = 0;
        for (int i = s.length()-1 ; i >= 0; i--){
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
        String reverse = "";
        for (int i = 0; i < s.length(); i++){
            reverse = reverse + letters[i];

        }

        return reverse;
    }


}