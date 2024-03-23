import java.util.Arrays;

public class StringIsAnagramsOrNot {

    public static boolean anagrams(String str1, String str2){
        boolean status = false;
     if(str1.length() != str2.length()){
         return status;
     }else{
         char[] arr1 = str1.toLowerCase().toCharArray();
         char[] arr2 = str2.toLowerCase().toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         status = Arrays.equals(arr1, arr2);
     }
     return status;
    }

    public static void main(String[] args) {
        String str1 = "Nikhil";
        String str2 = "Nikhl";
        if(anagrams(str1, str2)){
            System.out.println("String is Anagram !");
        }else{
            System.out.println("String is Not Anagrams !");
        }
    }
}
