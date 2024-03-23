public class BinarySearch {

   public static  int searchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
       int index = searchElement(arr, target);
        System.out.println(index);
    }
}


class Practice{
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 8;
        int result = searchElement(arr, target);
        System.out.println(result);
    }

    public static int searchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + ( end - start)/2;
            if(target > arr[mid]){
                end = end - 1;
            } else if (target < arr[mid]) {
                start = start + 1;
            }else{
                return  mid;
            }
        }
        return -1;
    }
}














