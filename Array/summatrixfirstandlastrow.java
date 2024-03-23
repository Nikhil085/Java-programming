public class summatrixfirstandlastrow {

    public static void findSum(int[][] arr, int n){
        int firstrow = 0;
        int lastrow = 0;
        for(int i=0;i<n; i++){
            for(int j=0; j<n; j++){
                if(i == 0)
                    firstrow += arr[0][j];
                else if(i==2)
                    lastrow += arr[2][j];
            }
        }
        System.out.println(firstrow+" "+lastrow);
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
