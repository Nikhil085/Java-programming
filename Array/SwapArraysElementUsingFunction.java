import java.util.Arrays;

public class SwapArraysElementUsingFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,45,6,7,8,9};
        int index1 = 2;
        int index2 = 6;
        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
