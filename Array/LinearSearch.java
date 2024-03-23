public class LinearSearch {

    public static int FindIndex(int[] arr,int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int key = 50;
        System.out.println("The Key Index Is = "+FindIndex(arr,key));
    }
}
