public class TwoMatricesEqualOrNot {
    public static void main(String[] args) {
        int row1,row2,col1,col2;
        boolean flage = false;

        int a[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 9, 7}
        };
        int b[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 9, 7}
        };

        row1 = a.length;
        col1 = a[0].length;

        row2 = b.length;
        col2 = b[0].length;

        if(row1 != row2 || col1 != col2){
            System.out.println("Matrices Are Not Equal !");
        }
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                if(a[i][j] != b[i][j]){
                    flage = true;
                    break;
                }
            }
        }
        if(flage){
            System.out.println("Is Not Equal !");
        }else{
            System.out.println("Is Equal !");
        }
    }
}
