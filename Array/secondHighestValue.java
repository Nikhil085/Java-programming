public class secondHighestValue {

    public static int findSecond(int[] arr){
        int highest = Integer.MIN_VALUE;
        int second_H = Integer.MIN_VALUE;
        System.out.println(highest);
        for(int i:arr){
            if(i > highest){
                second_H = highest;
                highest = i;
            }else if(i > second_H){
                second_H = i;
            }
        }
        return second_H;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,4,6,1,2};
        int n = findSecond(arr);
        System.out.println(n);
    }
}
