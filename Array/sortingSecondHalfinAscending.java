import java.util.Arrays;

public class sortingSecondHalfinAscending {

    public static void printOrder(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int temp;
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j=n/2; j<n-1; j++){
                if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n= arr.length;
        printOrder(arr,n);
    }
}
