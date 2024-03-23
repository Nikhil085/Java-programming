public class revStringUsingFun {

    public static String rotate(String str){
        String[] word = str.split(" ");
        StringBuilder rev  = new StringBuilder();
        for(int i=word.length - 1; i>=0; i--){
            rev.append(word[i]);
            if(i != 0){
                rev.append(" ");
            }
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String str = "Nikhil Is Cool !";
        System.out.println(rotate(str));
    }
}
