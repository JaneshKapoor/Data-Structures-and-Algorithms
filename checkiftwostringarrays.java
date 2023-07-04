public class checkiftwostringarrays {
    public static void main(String[] args) {
        String[] word1 = {"a","cb"};
        String[] word2 = {"ab","c"};

        String str1 = "";
        String str2 = "";
        for(int i = 0;i<word1.length;i++){
            str1 = str1 + word1[i];
        }
        for(int i = 0;i<word2.length;i++){
            str2 = str2 + word2[i];
        }

        if(str1.equals(str2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }    
}
