public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10};
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
        System.out.println();
    }
}
