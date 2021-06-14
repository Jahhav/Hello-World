import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[] args) {

        ArrayList <String> ListA = new ArrayList<>();

        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        ArrayList <String> ListB = new ArrayList<>();

        ListB.add("Apple");
        ListB.add("Avocado");
        ListB.add("Blueberries");
        ListB.add("Durian");
        ListB.add("Lychee");

        if (ListA.contains("Durian")){
            System.out.println(ListA);
            System.out.println(ListB);
        }
        else {
            System.out.println("Durian is missing");
        }

        ListB.remove("Durian");
        ListA.add(4, "Kiwifruit");

        System.out.println();
        System.out.println("ListA size: " + ListA.size() + " " + "ListB size: " + ListB.size());

        System.out.println();
        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));

        ListB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));

        System.out.println();
        System.out.println(ListB);
        System.out.println(ListA.get(2));




    }
}
