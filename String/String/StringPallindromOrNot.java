public class StringPallindromOrNot {
    public static boolean  rev(String str){
        if(str == null){
            return  false;
        }
        str = str.toLowerCase();
        StringBuilder rev = new StringBuilder(str);
                rev.reverse();
        return str.equals(rev.toString());
    }

    public static void main(String[] args) {
        String str = "madam";
        if(rev(str)){
            System.out.println("IS Pallindrom : ");
        }else{
            System.out.println("Is Not Pallindrom : ");
        }
    }
}
