import java.util.Arrays;

class SortingArrayAscendingOrder{
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 35, 21, 34, 11, 22, 33, 44, 67};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}