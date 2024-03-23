public class FindMissingNuminArray {
    public static void main(String[] args) {
        int[] nums = {2,3,1,0,5};
        int n = nums.length + 1;
        int total = n*(n-1)/2;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        int missingNum = total - sum;
        System.out.println(missingNum);
    }
}
