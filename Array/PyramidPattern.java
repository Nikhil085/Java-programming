import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Num Here - ");
        int n = sc.nextInt();
        for(int row=0; row<n; row++){

            for(int s=0; s<=n-row; s++){
                System.out.print(" ");
            }

            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
