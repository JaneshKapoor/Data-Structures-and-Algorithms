import java.util.Scanner;

public class takeamatrixandsearchano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];
        System.out.println("Input matrix elements");

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element you want to search");
        int x = sc.nextInt();
        
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                if(numbers[i][j] == x){
                    int m = i + 1;
                    int n = j + 1;
                    System.out.println(m + " " + n);
                }
            }
        }
        sc.close();
    }
}
