package Stringsprograms.com;

public class CountWordsWithoutUingSplint {
    public static void main(String[] args) {
        String s="Thank you so munch god giving this beautiful life";
        String s2="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count+1);
    }

}
