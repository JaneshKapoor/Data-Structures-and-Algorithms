import java.util.Scanner;

public class setmatrixzeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];
        int[] m = new int[numbers.length];
        int[] n = new int[numbers[0].length];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<n.length;j++){
                if(numbers[i][j] == 0){
                    m[i] = 1;
                    n[j] = 1;
                }
            }
        }

        for(int i = 0;i<m.length;i++){
            if(m[i] == 1){
                for(int j = 0;j<n.length;j++){
                    numbers[i][j] = 0;
                }
            }
        }
        for(int i = 0; i< n.length;i++){
            if(n[i] == 1){
                for(int j = 0;j<m.length;j++){
                    numbers[j][i] = 0;
                }
            }
        }

        // for(int i = 0;i<m.length;i++){
        //     System.out.print(m[i] + " ");
        // }

        // System.out.println("This is n:");
        // for(int i = 0;i<n.length;i++){
        //     System.out.print(n[i] + " ");
        // }
        // System.out.println("n ends");
        // int x = 0;
        // int y = 0;
        // for(int i = 0;i<rows;i++){
        //     for(int j = 0;j<columns;j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i = 0;i<rows;i++){
        //     for(int j = 0;j<columns;j++){
        //         if(numbers[i][j] == 0){
        //             x = i;
        //             y = j;
        //         }
        //     }
        // }

        // for(int i = 0;i<rows;i++){
        //     for(int j = 0;j<columns;j++){
        //         if(i == x){
        //             numbers[x][j] = 0;
        //         }
        //         if(j == y){
        //             numbers[i][y] = 0;
        //         }
        //     }
        // }

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
