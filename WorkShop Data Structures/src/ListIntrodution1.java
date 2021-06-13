import java.util.ArrayList;

public class ListIntrodution1 {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();



        System.out.println("number of the elements: " + str.size());

        str.add("William");

        if (str.size() > 0)
            for (int i = 0; i < str.size(); i++) {
                System.out.println(str.get(i));
            }
            else {
            System.out.println("The List is empty");
        }

            str.add("John");
            str.add("Amanda");

        System.out.println(str.size());
        System.out.println(str.get(2));

        System.out.println();

        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }

        System.out.println();

        str.remove(1);
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }

        System.out.println();

        for (int i = str.size()-1; i>=0; i-- ){
            System.out.println(str.get(i));
        }

        str.removeAll(str);
        for (int i = str.size()-1; i>=0; i-- ) {
            System.out.println(str.get(i));
        }


    }
}
