import java.util.Scanner;
public class findGreatestCommonGCD {

    public static int findGCD(int num1, int num2){
        if(num1 == 0){
            return num2;
        }else{
            return findGCD(num2, num1 % num2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Num = ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(findGCD(n1, n2));
    }
}
