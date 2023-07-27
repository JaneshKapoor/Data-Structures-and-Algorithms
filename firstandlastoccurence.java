import java.util.*;

public class firstandlastoccurence {

    public static int first = -1;
    public static int last = -1;

    public static void occurences(String s, int index,char elem){
        if(index == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(s.charAt(index) == elem){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        occurences(s, index+1, elem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        occurences(s,0,'a');
        sc.close();
    }
}
