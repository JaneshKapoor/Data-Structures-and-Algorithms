public class maximumnumberofwordsfoundinsentences {
    public static void main(String[] args) {
        int max = 0;
        String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        for(int i = 0;i<sentences.length;i++){
            int count = 0;
            int words = 0;
            for(int j = 0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j) == ' '){
                    count = count + 1;
                }
                words = count + 1;
            }
            if(words>max){
                max = words;
            }
        }
        System.out.println(max);
    }
}
