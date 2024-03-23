public class findLargestandsmallestString {
    public static void main(String[] args) {
        String str = "You Know, Nikhil is Cool Persone ";
        String[] word = str.split(" ");
        String smallest = word[0];
        String largest = word[0];
        for(String i : word){
            if(i.length() > largest.length())
                largest = i;
            if(i.length() < smallest.length())
                smallest = i;
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
