public class howmanynumberssmaller {
    public static void main(String[] args) {
        //Creating the array
        int[] nums = {7,7,7,7};
        int[] narray = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            narray[i] = nums[i];
        }

        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = 0;j<nums.length;j++){
                if(narray[i] > narray[j] && j!=i){
                    count = count + 1;
                }
            }
            nums[i] = count;
        }

        //Printing the array
        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
