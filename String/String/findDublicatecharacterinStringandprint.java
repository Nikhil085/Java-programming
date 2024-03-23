class findDublicatecharacterinStringandprint{
    public static void main(String[] args) {
        String str = "Great responsibility";
        char[] String1 = str.toCharArray();
        int count = 0;
        for(int i=0; i<String1.length; i++){
            count = 1;
            for(int j=i+1; j<String1.length; j++){
                if(String1[i] == String1[j] && String1[i] != ' '){
                    count++;
                    String1[j] = '0';
                }
            }
            if(count > 1 && String1[i] != '0'){
                System.out.println(String1[i]+" ");
            }
        }
    }
}