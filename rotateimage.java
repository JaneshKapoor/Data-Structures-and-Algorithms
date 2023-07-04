public class rotateimage {

    public static void reverserray(int[][] matrix,int size){
        for(int i = 0;i<size;i++){
            for(int j = 0;j<size/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][size-j-1];
                matrix[i][size-j-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        
        //Transpose of a matrix
        for(int i = 0;i<=n-2;i++){
            for(int j = i + 1;j<=n-1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        reverserray(matrix, n);

        //Printing the array
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }    
}
