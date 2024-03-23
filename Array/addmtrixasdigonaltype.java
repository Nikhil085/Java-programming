public class addmtrixasdigonaltype {

    public static void findSum(int[][] arr, int n){
        int fd = 0, sd = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==i)
                    fd += arr[i][j];
                if((j+i) == (n-1))
                    sd += arr[i][j];
            }
        }
        System.out.println(fd+" "+(sd - arr[1][1]));
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
