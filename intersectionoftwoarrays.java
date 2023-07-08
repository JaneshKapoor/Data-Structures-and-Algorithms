import java.util.*;
public class intersectionoftwoarrays {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i = 0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i = 0;i<arr2.length;i++){
            set2.add(arr2[i]);
        }
        set1.retainAll(set2);
        System.out.println(set1.size());
    }
}
