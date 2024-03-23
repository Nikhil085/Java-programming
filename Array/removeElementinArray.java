import java.util.Arrays;

public class removeElementinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i: arr){
            System.out.println(i+" ");
        }
        int[] arr_new = new int[arr.length - 1];
        int j=5;
        for(int i=0, k=0; i<arr.length; i++){
            if(i!=j){
                arr_new[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr_new));
    }
}
