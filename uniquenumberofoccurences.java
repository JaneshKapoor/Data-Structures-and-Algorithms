import java.util.*;
public class uniquenumberofoccurences {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {1,2,2,1,1,3};
        for(int i = 0;i<arr.length;i++){
            int count = 0;
            map.put(arr[i], count);
        }
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i], map.get(arr[i]) + 1);
        }
        // for(Map.Entry<Integer,Integer> e: map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        int[] newarr = new int[map.size()];
        int i = 0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            newarr[i] = e.getValue();
            i++;
        }
        for(int j = 0;j<newarr.length;j++){
            if(newarr[j] != 1){
                System.out.println(false);;
            }
            else{
                System.out.println(true);
            }
        }
        System.out.println(map);
    }
}
