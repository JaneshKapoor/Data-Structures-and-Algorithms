import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

public class decompressrunlength {
    public static void main(String[] args) {
        ArrayList<Integer> nList = new ArrayList<Integer>();
        int[] nums = {1,1,2,3};
        for(int i = 0;i<nums.length-1;i++){
            if(i%2==0){
                for(int j = 0;j<nums[i];j++){
                    nList.add(nums[i+1]);
                }
            }
        }
        int[] nnums = new int[nList.size()];
        for(int i = 0;i<nList.size();i++){
            nnums[i] = nList.get(i);
        }
        // for(int i = 0;i<nnums.length;i++){
        //     System.out.println(nnums[i]);
        // }
        
        // List<Integer> nList = new ArrayList<Integer>();
        // for(int i = 0;i<nums.length-1;i++){
        //     if(i%2==0){
        //         nList = Collections.nCopies(nums[i],nums[i+1]);
        //         // List<nList> nList;
        //     }
        // }
        // System.out.println(nList);
    }
}
