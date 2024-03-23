public class FindUniqueWordInString {

    public static void printUniqWord(String str){
        String[] words = str.split(" ");
        int count;
        for(int i=0; i<words.length; i++){
            count = 1;
            for(int j=i+1; j<words.length; j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    count++;
                    words[j] = "";
                }
            }
            if(count == 1 && words[i] != ""){
                System.out.println(words[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "Nikhil Is Nikhil Cool Guy";
        printUniqWord(str);
    }
}
