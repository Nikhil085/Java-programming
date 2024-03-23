import java.util.Scanner;

public class FindNumPallindromorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num Here : ");
        int n = sc.nextInt();
        int rem;
        int rev = 0;
        int temp = n;
        while(n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if(temp == rev){
            System.out.println("Is Pallindrom");
        }else {
            System.out.println("Is Not");
        }
    }
}
