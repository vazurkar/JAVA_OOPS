import java.util.*;

public class creation {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("China", 140);
        map.put("US", 30);

        // Access
        System.out.println(map.get("India"));

        // search
        if (map.containsKey("russia")) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }

        // iteration
        // for (Map.Entry<String, Integer> e : map.entrySet()) {
        //     System.out.println(e.getKey() + " " + e.getValue());
        // }


        //to remove
        map.remove("US");
        System.out.println(map);

    }
}