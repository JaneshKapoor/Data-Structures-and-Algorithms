import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

public class pascalstriangle {

    public static ArrayList<Integer> generaterow(int n){
        int res = 1;
        ArrayList<Integer> templist = new ArrayList<Integer>();
        templist.add(1);
        for(int i = 1;i<n;i++){
            res = res * (n-i);
            res = res/(i);
            templist.add(res);
        }
        return;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            list.add(generaterow(i));
        }
        System.out.println(list);
        sc.close();
    }
}
