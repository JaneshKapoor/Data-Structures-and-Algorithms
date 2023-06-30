import java.util.Scanner;

public class summultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
