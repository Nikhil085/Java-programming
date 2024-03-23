/*
Enter Your Number = 5
        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *
        *  *  *  *  *  *
class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number = ");
        int n = sc.nextInt();
        for(int row=0; row<=n; row++){
            for(int col=0; col<=row; col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}*/




/*
Enter Your Num = 5

        *  *  *  *  *  *
        *  *  *  *  *
        *  *  *  *
        *  *  *
        *  *
        *

class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Num = ");
        int n = sc.nextInt();
        for(int row=0; row<=n; row++){
            for(int col=n; col>=row; col--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
*/

/*

       * 
      **
     ***
    ****
   *****
  ******
 *******

class Practice{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int row=0; row<=n; row++){

           for(int s=0; s<=n-row; s++){
               System.out.print(" ");
           }

           for(int col=0; col<=row; col++){
               System.out.print("*");
           }
           System.out.println(" ");
       }
    }
}
 */




/*Enter Your Number Here = 5

        *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  *
        *  *  *  *
        *  *  *
        *  *
        *

class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number Here = ");
        int n = sc.nextInt();
        for(int row=0; row<= 2 * n; row++){

            int total = row > n ? (2*n) - row : row;

            for(int col=0; col<total; col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}*/


/*

Enter Your Number = 5
           *
          * *
         * * *
        * * * *
       * * * * *
      * * * * * *

class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number = ");
        int n = sc.nextInt();
        for(int row=0; row<=n; row++){

            for(int s=0; s<=n-row; s++){
                System.out.print(" ");
            }

            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
*/

/*
Enter Your Num = 5

                 *
                * *
               * * *
              * * * *
             * * * * *
            * * * * * *
             * * * * *
              * * * *
               * * *
                * *
                 *

class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Num = ");
        int n = sc.nextInt();
        for(int row=0; row<=2 * n; row++){

            int total = row > n ? 2 * n - row : row;
            int des = n - total;

            for(int s=0; s<=des; s++){
                System.out.print(" ");
            }

            for(int col=0; col<=total; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}*/

/*
Enter Your Num = 5

        * * * * *
         * * * *
          * * *
           * *
            *

class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Num = ");
        int n = sc.nextInt();
        for(int row=0; row<=n; row++){

            for(int s=0; s<=row; s++){
                System.out.print(" ");
            }

            for(int col=0; col<=n-row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/




