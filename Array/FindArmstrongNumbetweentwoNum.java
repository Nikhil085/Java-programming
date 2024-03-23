import java.util.Scanner;

public class FindArmstrongNumbetweentwoNum {

    public static int getLength(int num){
        int len = 0;
        while (num != 0){
            len++;
            num = num / 10;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

     for(int i=low; i<=high; i++){
         int sum = 0, temp, digit, len;
         temp = i;
         len = getLength(i);
         while ( temp != 0){
             digit = temp % 10;
             sum += Math.pow(digit, len);
             temp = temp / 10;
         }
         if(sum == i){
             System.out.print(i+" ");
         }
     }
    }
}
