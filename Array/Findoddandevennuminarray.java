public class Findoddandevennuminarray {
    public static void main(String[] args) {
        int[] arr = {12,21,22,2,4,5,6,34,46,67,78};
        int ctr = 0;
        for(int num: arr){
            if(num % 2 == 0){
                ctr++;
            }
        }
        System.out.print("Even Num is = "+ctr);
        System.out.print("\nOdd Num Is = "+(arr.length - ctr));
    }
}
