public class matrixdiagnolsum {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int m = mat.length;
        int n = mat[0].length;
        int sum = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(i == j){
                    sum = sum + mat[i][j];
                }
            }
        }
        for(int i = 0;i<m;i++){
            int k = m - i - 1;
            if(i!=k){
                sum = sum + mat[i][m-i-1];
            }
        }
        // for(int i = 0;i<m;i++){
        //     int j = n-1;
        //     if(j>=0){
        //         sum = sum + mat[i][j];
        //         j = j -1;
        //     }
        // }
        System.out.println(sum);
    }
}
