import java.util.Arrays;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
         for(int i=0; i<arr.length/2; i++){
             int j= arr[i];
             arr[i] = arr[arr.length - i-1];
             arr[arr.length - i-1] = j;
         }
        System.out.print(Arrays.toString(arr));
    }
}
