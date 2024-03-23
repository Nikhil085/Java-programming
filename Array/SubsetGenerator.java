import java.util.ArrayList;
import java.util.List;

public class SubsetGenerator {

    public static List<List<Integer>> getAllSubsets(int[] arr){
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());

        for(int num:arr){
            int n = subsets.size();
            for(int i=0; i<n; i++){
               List<Integer> subset = new ArrayList<>(subsets.get(i));
               subset.add(num);
               subsets.add(subset);
            }
        }
        return  subsets;

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = getAllSubsets(nums);

        // Print the subsets
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
