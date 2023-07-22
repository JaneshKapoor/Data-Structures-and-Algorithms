public class selectionsort {

    public static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};

        //Selection sort
        for(int i = 0;i<arr.length-1;i++){
            int smallestindex = i;
            for(int j = i + 1;j<arr.length;j++){
                if(arr[smallestindex] > arr[j]){
                    smallestindex = j;
                }
            }
            int temp = arr[smallestindex];
            arr[smallestindex] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }
}
