import java.util.Arrays;

public class AddtwoMatricesWithSamelength {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,4}};
        int[][] arr2 = {{6,5,4},{8,7,6}};
        int[][] arr3 = new int[3][3];
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
