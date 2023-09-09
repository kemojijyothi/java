package Stringsprograms.com;

public class ConverLowerCase {
    public static void main(String[] args) {
        String s="Vikra I Love you so MuCh";
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z'){
               int n=ch+32;
               ch=(char)n;

            }
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}
