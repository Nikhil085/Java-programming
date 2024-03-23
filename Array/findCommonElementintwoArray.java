import java.util.Arrays;

public class findCommonElementintwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,7,8,9};

        for(int i=0; i< arr1.length; i++){
            for(int j=0; j< arr1.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr2[j]);
                }
            }
        }
    }
}
