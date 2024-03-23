import java.util.Arrays;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int possition = 5;
        int element = 99;
        int[] new_arr = new int[arr.length + 1];
        for(int i=0; i<arr.length + 1; i++){
            if(i < (possition - 1))
                new_arr[i] = arr[i];
            else if ( i == (possition - 1))
                new_arr[i] = element;
            else
               new_arr[i] = arr[i-1];
        }
        System.out.print(Arrays.toString(new_arr));
    }
}
