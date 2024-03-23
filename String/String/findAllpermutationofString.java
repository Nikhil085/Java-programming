public class findAllpermutationofString {

    static void printPermutation(String str, String str2){
        if(str.length() == 0){
            System.out.println(str2+" ");
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String str3 = str.substring(0,i) + str.substring(i+1);
            printPermutation(str3, str2+ch);
        }
    }

    public static void main(String[] args) {
        String str = "cat";
        printPermutation(str," ");
    }
}
