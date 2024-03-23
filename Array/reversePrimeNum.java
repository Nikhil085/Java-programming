import java.util.Scanner;

public class reversePrimeNum {

    public static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Num = ");
        int n = sc.nextInt();
        for(int i=n-1; i>=0; i--){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
}
