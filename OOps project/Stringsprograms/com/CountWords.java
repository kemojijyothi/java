package Stringsprograms.com;

public class CountWords {
    public static void main(String[] args) {
        String s="i love you vikram";
        int count=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
