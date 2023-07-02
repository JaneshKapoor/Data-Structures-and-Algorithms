public class strings {
    public static void main(String[] args) {
        //Reverse a string
        StringBuilder sb = new StringBuilder("Tony");
        for(int i = sb.length()-1;i>=0;i--){
            System.out.print(sb.charAt(i));
        }
    }    
}
