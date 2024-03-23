import java.util.HashSet;

class HashsetfindElementinArrays{

    public static int findDub(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int nums: arr){
            if(set.contains(nums)){
                return nums;
            }
            set.add(nums);
        }
        return -1;
    }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,6,7};
    int index = findDub(arr);
        System.out.println(index);
    }
}