public class REverseWordsString {
    public static void main(String[] args) {
        String str = "Nikhil is Cool";
        String[] word = str.split(" ");
        String rev = "";
        for(int i=word.length - 1; i>=0; i--){
            rev += word[i]+" ";
        }
        System.out.print(rev.substring(0,rev.length() - 1));
    }
}
