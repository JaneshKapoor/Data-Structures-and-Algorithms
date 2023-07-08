import java.util.*;
public class majorityelement {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i]) == true){
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > (nums.length)/3){
                System.out.println(e.getKey());
            }
        }
        System.out.println(map);
    }   
}
