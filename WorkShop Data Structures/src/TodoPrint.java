import java.util.ArrayList;

public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText applying indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo


        ArrayList<String> MyTodo = new ArrayList<>();
        MyTodo.add("My todo:");
        MyTodo.add("- Buy milk");
        MyTodo.add("- Download games");
        MyTodo.add("       - Diablo");


        for (int i = 0; i < MyTodo.size(); i++){
            System.out.println(MyTodo.get(i));
        }


    }
}