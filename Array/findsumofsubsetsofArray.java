public class findsumofsubsetsofArray {

    public static void findsumofsubset(int[] arr, int l, int r, int sum){
        if(l > r){
            System.out.println(sum+" ");
            return;
        }
        findsumofsubset(arr, l+1, r, sum + arr[l]);
        findsumofsubset(arr, l+1, r, sum);
    }

    public static void main(String[] args){
        int[] arr = {5,4,3};
        int n = arr.length;
        findsumofsubset(arr, 0, n-1, 0);
    }
}
