import java.util.Scanner;

public class FindGivenNumArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Num Here - ");
        int n = sc.nextInt();
        int reminder, OriginalNum = n, result = 0;
        while (OriginalNum > 0){
            reminder = OriginalNum % 10;
            result += Math.pow(reminder, 3);
            OriginalNum = OriginalNum/10;
        }
        if(result == n)
            System.out.println("Is Yes !");
        else
            System.out.println("Is Not !");

    }
}
