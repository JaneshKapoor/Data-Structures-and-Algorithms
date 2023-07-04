public class tolowercase {
    public static void main(String[] args) {

        //Convert to lower case
        String s = "here";
        // String x = s.toLowerCase();
        // System.out.println(x);
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i<s.length();i++){
            if((s.charAt(i) >= 65) && (s.charAt(i) <=90)){
                char ch = (char)(s.charAt(i) + 32);
                sb.setCharAt(i, ch);
            }
        }
        System.out.println(sb);
    }
}
