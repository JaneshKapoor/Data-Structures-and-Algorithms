public class sortingthesentence {
    public static void main(String[] args) {
        String s = "Myself2 Me1 I4 and3";
        String m = "";
        String[] arr = s.split(" ");
        String[] newarr = new String[arr.length];
        for(int i = 0;i<arr.length;i++){
                char ch = arr[i].charAt(arr[i].length()-1);
                String n = "" + ch;
                int a = Integer.parseInt(n);
                newarr[a-1] = arr[i];
        }
        for(int i = 0;i<newarr.length;i++){
            m = m + newarr[i].substring(0, newarr[i].length()-1) + " ";
        }
        m = m.trim();
        System.out.println(m);
    }
}
