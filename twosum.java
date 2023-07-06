import java.util.ArrayList;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;  
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    arr.add(i);
                    arr.add(j);
                }
            }
        }
        int[] narr = new int[arr.size()];
        for(int i = 0;i<arr.size();i++){
            narr[i] = arr.get(i);
        }
    }
}
