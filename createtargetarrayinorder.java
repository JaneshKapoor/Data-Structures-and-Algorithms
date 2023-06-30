public class createtargetarrayinorder {

    public static int[] insertelement(int arr[],int elem,int pos){
        int[] newarr = new int[arr.length + 1];
        for(int i = 0;i<newarr.length;i++){
            if(i<pos - 1){
                newarr[i] = arr[i];
            }
            else if(i == pos - 1){
                newarr[i] = elem;
            }
            else{
                newarr[i] = arr[i-1];
            }
        }
        return newarr;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            insertelement(target,nums[i],index[i]);
        }

        // for(int i = 0;i<nums.length;i++){
        //     if(target[index[i]] != 0){
        //         target[index[i+1]] = target[index[i]]; 
        //     }    
        //     target[index[i]] = nums[i]; 
        // }

        for(int i = 0;i<target.length;i++){
            System.out.print(target[i] + " ");
        }
    }
}
