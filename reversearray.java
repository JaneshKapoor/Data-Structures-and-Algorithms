public class reversearray {

    
    public static void reverserray(int[] array,int size){
        for(int i = 0;i<size/2;i++){
            int temp = array[i];
            array[i] = array[size-i-1];
            array[size-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        reverserray(array,array.length);
        
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
