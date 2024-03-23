public class getunicodepointgivencharacter {
    public static void main(String[] args) {
        String str = "i am Here Dude !";
        int val = str.codePointAt(1);
        System.out.println("Charcter Unicode Point is - "+ val);
    }
}
