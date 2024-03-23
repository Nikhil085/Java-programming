public class findsmallestAndSecondSmallestElementintArray {
    public static int findSecondSmallest(int[] arr) {

    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
            secondSmallest = smallest;
            smallest = arr[i];
        }
        else if (arr[i] < secondSmallest && arr[i] != smallest) {
            secondSmallest = arr[i];
        }
    }
        System.out.println("Smallest Elemenmt = "+smallest);

        return secondSmallest;
}

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9};
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("Second smallest element: " + secondSmallest);
    }
}


