public class FindElementIndex {

    public static int findIndexOfElement(int[] arr, int item) {
        int len = arr.length;
        int i=0;
        while (i<arr.length){
            if(arr[i] == item) return i;
            else i=i+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,24,34,45,56,67,78,89,54,32,65};
        System.out.println(findIndexOfElement(arr, 67));
    }
}
