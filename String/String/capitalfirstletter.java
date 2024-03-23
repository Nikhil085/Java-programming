public class    capitalfirstletter {
    public static void main(String[] args) {
        String str = "nikhil is cool guy";
        String[] words = str.split(" ");
        String CapitalWords = "";
        for(String w:words){
            String first = w.substring(0,1);
            String AfterFirst = w.substring(1);
            CapitalWords += first.toUpperCase() + AfterFirst+" ";
        }
        System.out.println(CapitalWords);
    }
}
