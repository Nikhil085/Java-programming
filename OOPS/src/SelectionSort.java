public class SelectionSort{

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int[] a, int n){
        for(int i=0; i<n-1; i++){
            int set = i;

            for(int j=i+1; j<n; j++){
                if(a[j] < a[set])
                    set = j;
            }
            swap(a,i,set);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,5,1,6,8,4,3,9,7};
        System.out.println("Before Sorting ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        selectionSort(a, a.length);
        System.out.println();
        System.out.println("After Sort !");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
