public class truncatesentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        String[] arr = s.split(" ");
        int k = 4;
        String m = "";
        for(int i = 0;i<k;i++){
            m = m + arr[i] + " ";
        }
        m = m.trim();
        System.out.println(m);
        
    }
}
