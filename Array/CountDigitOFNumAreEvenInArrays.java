public class CountDigitOFNumAreEvenInArrays {
    public static void main(String[] args) {
        int[] arr = {12,234,45,5754};
        System.out.println(FindNum(arr));
    }

    static int FindNum(int[] arr){
        int count = 0;
        for(int nums: arr){
            if(even(nums)){
                count++;

            }
        }
        return  count;
    };

    static boolean even(int nums){
        int numsDigit = digit(nums);
            if(numsDigit % 2 == 0){
                return true;
            }
        return false;
    };

    static int digit(int nums){
        int count = 0;
        while (nums > 0){
            count++;
            nums = nums / 10;
        }
        return count;
    }

}
