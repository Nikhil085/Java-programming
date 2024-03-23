public class     FindSpecificElement {
    public static  boolean findElement(int[] arr, int item){
        for(int n: arr){
            if(item == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {12,24,34,45,56,67,78,89,54,32,65};
        System.out.println(findElement(arr, 56));
    }
}
