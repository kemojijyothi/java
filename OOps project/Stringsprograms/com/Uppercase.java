package Stringsprograms.com;

public class Uppercase {
    public static void main(String[] args) {
        String s="bavikatty vikram kumar";
        String up="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                int n=ch-32;
                ch=(char)n;
            }
            up=up+ch;
        }
        System.out.println(up);
    }
}
