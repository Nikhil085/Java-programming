import java.util.Arrays;

public class RemoveDublicateElementFromArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,6,7,2,3};
        int length = arr.length;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(arr[i] == arr[j]){
                    arr[j] = arr[length - 1];
                    length--;
                    j--;
                }
            }
        }
        int[] Uniqu = Arrays.copyOf(arr, length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(Uniqu));
    }
}
