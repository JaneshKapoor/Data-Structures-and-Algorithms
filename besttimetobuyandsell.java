import java.lang.Math;

public class besttimetobuyandsell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i] - min);
        }
        System.out.println(max);
    }    
}
