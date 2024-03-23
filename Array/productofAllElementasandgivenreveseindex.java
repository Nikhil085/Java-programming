import java.util.Arrays;

public class productofAllElementasandgivenreveseindex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int[] newArr = new int[n];
        for(int i=0; i<n; i++){
            newArr[i] = leftProduct;
            leftProduct *= arr[i];  //
        }
        for(int i=n-1; i>=0; i--){
            newArr[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
