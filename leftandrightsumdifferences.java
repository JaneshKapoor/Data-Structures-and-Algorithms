public class leftandrightsumdifferences{
    public static void main(String[] args) {

        int nums[] = {10,4,8,3};
        int leftsum[] = new int[nums.length];
        int rightsum[] = new int[nums.length];
        int answers[] = new int[nums.length];
        //Left Sum
        for(int i =0;i<nums.length;i++){
            int sum = 0;
            if(i == 0){
                leftsum[0] = sum;
            }
            else{
                for(int j = 0;j<i;j++){
                    sum = sum + nums[j];
                }
                leftsum[i] = sum;
            }
        }
        //Right Sum
        for(int i = nums.length-1; i >=0;i--){
            int sum = 0;
            if(i == nums.length-1){
                rightsum[nums.length-1] = sum;
            }
            else{
                for(int j = nums.length-1;j>i;j--){
                    sum = sum + nums[j];
                }
                rightsum[i] = sum;
            }
        }
        
        //Answers
        for(int i = 0;i<answers.length;i++){
            answers[i] = Math.abs(leftsum[i] - rightsum[i]);
        }

        // for(int i = 0;i<leftsum.length;i++){
        //     System.out.print(leftsum[i] + " ");
        // }   
        // System.out.println();
        // for(int i = 0;i<leftsum.length;i++){
        //     System.out.print(rightsum[i] + " ");
        // }   
        // System.out.println();
        // for(int i = 0;i<answers.length;i++){
        //     System.out.print(answers[i] + " ");
        // }
    }
}