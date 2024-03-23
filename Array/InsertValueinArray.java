import java.util.Arrays;

public class InsertValueinArray {

    public static void main(String[] args) {
        int[] arr = {12,23,34,45,45,53,45,57,78};
            System.out.println(Arrays.toString(arr));
        int index_position = 5;
        int newValue = 100;
        for(int i= arr.length - 1; i>index_position; i--){
            arr[i] = arr[i-1];
        }
        arr[index_position] = newValue;
        System.out.println(Arrays.toString(arr));
    }
}
