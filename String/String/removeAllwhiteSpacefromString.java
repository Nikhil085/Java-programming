public class removeAllwhiteSpacefromString {
    public static void main(String[] args) {
        String str = " Geeks For Geeks ";


        str = str.replaceAll("\\s", "");
        System.out.println(str);

        //////////////////////////////

//        String op = "";
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if(!Character.isWhitespace(ch)){
//                op += ch;
//            }
//        }
//        System.out.println(op);
    }
}
