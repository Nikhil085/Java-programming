public class sortString {
    public static void main(String[] args) {
        char[] arr = "Nikhil".toCharArray();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(Character.toLowerCase(arr[i])> Character.toLowerCase(arr[j])){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(String.valueOf(arr));
    }
}
