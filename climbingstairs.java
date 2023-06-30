import java.util.*;
public record climbingstairs() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1){
            System.out.println(1);
        }
        if (n == 2){
            System.out.println(2);
        }
        int[] a = new int[n];
        if(n > 2){
            a[0] = 1;
            a[1] = 2;
            for(int i = 2;i<n;i++){
                a[i] = a[i-1] + a[i-2];
            }
        }
        System.out.println(a[n-1]);
        sc.close();
    }
}