public class mtrixdiagonalinterchange {

    public static void findSum(int[][] arr, int n){
        for(int i=0; i<n; i++){
            if(i != n/2){
                int temp = arr[i][i];
                arr[i][i] = arr[i][n-i-1];
                arr[i][n-i-1] = temp;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {5, 6, 7},
                {9,10,11} };
        int n = 3;
        findSum(arr, n);
    }
}
