public class romantointeger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            String m = "" + ch;
            if(m.equals("I") == true){
                sum = sum + 1;
            }
            if(m.equals("V") == true){
                if(i != 1){
                    char nch = s.charAt(i-1);
                    String nm = "" + nch;
                    if(nm.equals("I")){
                        sum = sum + 4;
                    }
                }
                else{
                    sum = sum + 5;
                }
            }

            if(m.equals("V") == true && i!=1){
                char nch = s.charAt(i-1);
                String nm = "" + nch;
            }

            if(m.equals("X") == true){
                sum = sum + 10;
            }
            if(m.equals("L") == true){
                sum = sum + 50;
            }
            if(m.equals("C") == true){
                sum = sum + 100;
            }
            if(m.equals("D") == true){
                sum = sum + 500;
            }
            if(m.equals("M") == true){
                sum = sum + 1000;
            }
        }
        System.out.println(sum);
    }
}
