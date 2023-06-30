public class runningsumof1darray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int runningSum[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            if(i == 0){
                runningSum[i] = nums[i];
            }
            for(int j = 0;j<=i;j++){
                sum = sum + nums[j];
            }
            runningSum[i] = sum;
        }
        for(int i = 0;i<runningSum.length;i++){
            System.out.print(runningSum[i] + " ");
        }
    }
}
