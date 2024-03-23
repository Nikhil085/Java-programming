public class DevideStringEqualNpart {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        int len = str.length();
        int n=3;
        int temp = 0,chars = len/n;
       String[] equalStr = new String[n];
       if(len % n != 0){
           System.out.println("String Is Not Devided Equally !");
       }

       for(int i=0; i<str.length(); i= i+chars){
           String part = str.substring(i , i+chars);
           equalStr[temp] = part;
           temp++;
       }
        System.out.println("Equal Part Of Given String are !");
        for(int i=0; i<equalStr.length; i++){
            System.out.println(equalStr[i]);
        }
    }
}
