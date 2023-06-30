public class maximumnumberofwordsfoundinsentences {
    public static void main(int[] args) {
        int max = 0;
        String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        for(String i : sentences){
            String[] w = i.split("\\s+");
            if(w.length>=max){
                max = w.length;
            }
        }
        System.out.println(max);
    }
}
