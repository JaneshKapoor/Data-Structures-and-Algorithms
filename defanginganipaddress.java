public class defanginganipaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        // StringBuilder sb = new StringBuilder(address);
        // for(int i = 0;i<address.length();i++){
        //     char ch = address.charAt(i);
        //     String n = "" + ch;
        //     // System.out.println(n);
        //     if(n.compareTo(".") == 0){
        //         address.replace(".","[.]");
        //     }
        // }
        String newstring = address.replace(".","[.]");
        System.out.println(newstring);
    }
}
