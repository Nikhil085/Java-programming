public class pascaltringal {
    public static void main(String[] args) {
        int n = 5;
        for(int row=0; row<=n; row++){
            for(int s=0; s<=n-row; s++){
                System.out.print(" ");
            }
            int  c= 1;
            for(int col=1; col<=row; col++){
                System.out.print(c+" ");
                c = c * (row - col)/col;
            }
            System.out.println(" ");
        }
    }
}
