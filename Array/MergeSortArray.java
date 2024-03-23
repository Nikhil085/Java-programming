import java.util.Arrays;

public class MergeSortArray {

    public static void merge(int[] a, int  m, int n, int[] b){
        for(int i=0; i<n; i++)
            a[i + m] = b[i];
            Arrays.sort(a);
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int[] a = new int[m + n];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        int[] b = {2, 6, 7};
        merge(a, m, n, b);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
/*
    int[] first = {1,2,3,4,5};
    int[] second = {6,7,8,9,10,11};
    int length = first.length + second.length;
    int[] mergedArray = new int[length];
    int pos = 0;
       for(int i: first){
               mergedArray[pos] = i;
               pos++;
               }
               for(int i: second){
               mergedArray[pos] = i;
               pos++;
               }
               System.out.print(Arrays.toString(mergedArray));*/
