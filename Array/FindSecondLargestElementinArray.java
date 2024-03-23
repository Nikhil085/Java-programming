import java.util.Arrays;

public class FindSecondLargestElementinArray {
    public static void main(String[] args) {
        int[] arr = {12,2,34,45,56,24,45,34,45,5};
         int size, temp;
         size = arr.length;
         for(int i=0; i<size; i++){
             for(int j=i+1; j<size; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
             }
         }
        System.out.println(Arrays.toString(arr));
        System.out.print("Second Largest Element = "+ (arr[size-2]));
    }
}
