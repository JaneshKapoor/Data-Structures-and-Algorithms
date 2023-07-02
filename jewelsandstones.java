public class jewelsandstones {
    public static void main(String[] args) {
        int count = 0;
        String jewels = "z";
        String stones = "ZZ";
        for(int i = 0;i<stones.length();i++){
            char s = stones.charAt(i);
            String n = "" + s;
            if(jewels.contains(n)){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
