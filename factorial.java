import java.util.Scanner;
public class factorial {

    public static int f(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * f(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = f(n);
        System.out.println(res);
        sc.close();
    }
}
