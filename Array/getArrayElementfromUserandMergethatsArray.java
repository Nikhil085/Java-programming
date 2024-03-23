import java.sql.SQLOutput;
import java.util.Scanner;

public class getArrayElementfromUserandMergethatsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter First Array Size : ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("ENter Your First Array Element : ");
        for(int i=0; i<size1; i++){
         arr1[i] = sc.nextInt();
        }

        System.out.print("ENter Second Array Size");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter Your Second Array Element : ");
        for(int i=0; i<size2; i++){
            arr2[i] = sc.nextInt();
        }
        int arr1L = arr1.length;
        int arr2L = arr2.length;
        int arr3L = arr1L + arr2L;
        int[] arr3 = new int[arr3L];

        for(int i=0; i<arr1L; i++){
           arr3[i] = arr1[i];
        }
        for(int i=0; i<arr2L; i++){
            arr3[arr1L + i] = arr2[i];
        }
        for(int i=0; i<arr3L; i++){
            System.out.print(arr3[i]+", ");
        }
    }
}
