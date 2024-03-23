import java.util.Arrays;

public class    RightForwordElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n =3;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0; i<n; i++){
            int j, last = arr[arr.length - 1];
            for(j= arr.length - 1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
    }
}

//
//    int[] arr = {1,2,3,4,5};
//    int n= 5;
//       for(int i=0; i<arr.length; i++){
//        int temp = arr[i];
//        arr[i] = arr[n-1];
//        arr[n-1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
