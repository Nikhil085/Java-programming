public class addandfindtargetvalueofasrrayelement {
    public static void main(String[] args) {
        int[] arr = {-15, -11, -8, -4, -1, 1, 4, 7, 11, 15};
        int right = arr.length - 1;
        int left = 0;
        while(left < right){
            int sum = arr[left] + arr[right];
         if(sum == 0){
             System.out.println(arr[left]+" + "+arr[right]);
             left++;
             right--;
         }else if(sum < 0){
             left++;
         }else{
             right--;
         }
        }
    }
}
