import java.util.ArrayList;
import java.util.Collections;
public class arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        System.out.println(list);

        //get
        System.out.println(list.get(0));

        //add el in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(2);

        //size
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
    }
}
