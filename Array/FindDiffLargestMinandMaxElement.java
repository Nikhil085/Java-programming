public class FindDiffLargestMinandMaxElement {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,67,21,32,43};
        int min,max;
        min = arr[0];
        max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
            else if (arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println("MAX = "+max);
        System.out.println("MIN = "+min);
        System.out.print("\nDifference Main and Max Elements = "+(max - min));
    }
}
