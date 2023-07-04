import java.util.List;
import java.util.ArrayList;

public class countitemsmatchingarule {
    public static void main(String[] args) {
        String ruleKey = "color";
        String ruleValue = "silver";
        int count = 0;
        List<List<String>> items = new ArrayList<>();
        List<String> child = new ArrayList<>();
        child.add("phone");
        child.add("blue");
        child.add("pixel");
        items.add(child);
        child.add("computer");
        child.add("silver");
        child.add("lenovo");
        items.add(child);
        child.add("phone");
        child.add("gold");
        child.add("iphone");
        items.add(child);

        for(int i = 0;i<items.size();i++){
            if(ruleKey.equals("type")){
                if(ruleValue.equals(items.get(i).get(0))){
                    count = count + 1;
                }
            }
            if(ruleKey.equals("color")){
                if(ruleValue.equals(items.get(i).get(1))){
                    count = count + 1;
                }
            }
            if(ruleKey.equals("name")){
                if(ruleValue.equals(items.get(i).get(2))){
                    count = count + 1;
                }
            }
        }

        for(int i = 0;i<items.size();i++){
            for(int j = 0;j<items.get(i).size();j++){
                System.out.print(items.get(j));
            }
            System.out.println();
        }
        
        System.out.println(count);
    }
}
