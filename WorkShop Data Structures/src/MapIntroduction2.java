import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {

        HashMap <String, String> mapka = new HashMap<String, String>();

        mapka.put("978-1-60309-452-8","A Letter to Jo");
        mapka.put("978-1-60309-459-7","Lupus");
        mapka.put("978-1-60309-444-3","Red Panda and Moon Bear");
        mapka.put("978-1-60309-461-0","The Lab");

        for (String ID: mapka.keySet()){
            System.out.println();
        }

    }
}
