import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("US", 30);
        map.put("China", 150);


        System.out.println(map);
        // if(map.containsKey("dfa")){
        //     System.out.println("Key is present in the map");
        // }
        // else{
        //     System.out.println("Key is not present in the map");
        // }
        // System.out.println(map.get("China"));
        // System.out.println(map.get("Indonesia"));

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }

        map.remove("China");
        System.out.println(map);
    }
}
