public class reverseStringwordatPlace {
        public static String reverseWords(String s) {
            String[] arr = s.split(" ");
            StringBuilder rev = new StringBuilder();
            for(String i: arr){
                StringBuilder revword = new StringBuilder(i);
                revword.reverse();
                rev.append(revword).append(" ");
            }
            rev.deleteCharAt(rev.length() - 1);
            return rev.toString();
        }

    public static void main(String[] args) {
        String str = "Nikhi is Cool";
        System.out.println(reverseWords(str));
    }
}
