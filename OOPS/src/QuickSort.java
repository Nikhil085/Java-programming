import java.util.Arrays;

class QuickSort{

    public static void quickSort(int[] nums, int low, int high){
        if(low < high){
            int pivot_index = partition(nums, low, high);
            quickSort(nums, low,pivot_index -1);
            quickSort(nums, pivot_index+1, high);
        }
    }

    public static int partition(int[] nums, int low, int high){
        int pivot = nums[high];
        int i = low;
        for(int j=low;j<high; j++){
            if(nums[j] <= pivot){
                swap(nums, i,j);
                i++;
            }
        }
        swap(nums, i, high);
        return i;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,54,6,7,8,4,3,24,5,6,7,78,5,4};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}