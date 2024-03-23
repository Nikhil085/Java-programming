public class StringsrotationofanotherString{

    public static boolean isRotation(String str1, String rotation){
        String str2 = str1 + str1;
        if(str2.contains(rotation)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(
                "java2blog and blogjava2 are rotation of each other : " + isRotation("java2blog", "blogjava2"));
        System.out.println(
                "java2blog and avablog2j are rotation of each other : " + isRotation("java2blog", "avablog2j"));
    }
}
