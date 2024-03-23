public class maximumandminimum {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,54,56,67,78,67,42,21,12};
          int min, max;
          min = arr[0];
          max = arr[0];
          for(int i=0; i<arr.length - 1;i++){
              if(arr[i] < min)
                 min = arr[i];
              if(arr[i] > max)
                  max = arr[i];
          }
        System.out.print("MAX = "+ max);
        System.out.print("\nMIN = "+ min);
    }
}
