public class FindtheSumofEachRowAndCol {
    public static void main(String[] args) {
        int row1,col1;
        //Initialize matrix a
        int a[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        row1 = a.length;
        col1 = a[0].length;
        for(int i=0; i<row1;i++){
            int SumOfRow = 0;
            for(int j=0; j<col1; j++){
                SumOfRow = SumOfRow + a[i][j];
            }
            System.out.print(SumOfRow+" ");
        }

        System.out.println(" ");
        for(int i=0; i<col1; i++){
            int SumOfCol = 0;
            for(int j=0; j<row1; j++){
                SumOfCol = SumOfCol + a[j][i];
            }
            System.out.print(SumOfCol+" ");
        }
    }
}
