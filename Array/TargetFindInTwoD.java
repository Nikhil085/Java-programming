import java.util.Arrays;

public class TargetFindInTwoD {
        public static void main(String[] args) {
            int[][] arr = {
                    {12,23,34,45,56},
                    {43,54,76,87,98},
                    {1,2,4,5,6,7,8}
            };
            int target = 76;
            int[] ans = serach(arr, target);
            System.out.print(Arrays.toString(ans));
        }

        public static int[] serach(int[][] arr1, int target){
            for(int row=0; row<arr1.length; row++){
                for(int col=0; col<arr1[row].length; col++){
                    if(arr1[row][col] == target){
                        return new int[] {row, col};
                    }
                }
            }
            return new int[]{-1};
        }
    }
