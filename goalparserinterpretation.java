public class goalparserinterpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        String s = "";
        
        for(int i = 0;i<command.length();i++){
            if(command.charAt(i) == 'G'){
                s = s + "G";
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                s = s + "o";
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == 'a' && command.charAt(i+2) == 'l' && command.charAt(i+3) == ')'){
                s = s + "al";
            }
        }
        System.out.println(s);
    }
}
