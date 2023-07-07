public class searcha2dmatrix {

    public static boolean binarysearch(int[][] matrix, int row, int low, int hi,int target){
        while(low<=hi){
            int mid = (low + hi)/2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid] >= target){
                hi = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        // int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[][] matrix = {{1,3}};

        int h = matrix[0].length - 1;
        boolean ans = false;
        int target = 3;
        for(int i = 0;i<matrix.length;i++){
            if(matrix[i][h] >= target){
                ans = binarysearch(matrix, i, 0, h, target);
                break;
            }
        }
        System.out.println(ans);

    }
}
