// import java.util.*;
public class reversewordsinastring {
    public static void main(String[] args) {
        String s = "a good   example";
        s = s.trim();
        String n = "";
        String m = s.replaceAll("\s+"," ");
        System.out.println(m);
        String[] arr = m.split(" ");
        for(int i = arr.length-1;i>=0;i--){
            String x = arr[i];
            x = x.trim();
            if(i > 0){
                n = n + x + " ";
            }
            else if(i == 0){
                n = n + x;
            } 
        }
        System.out.print(n);
    }
}
