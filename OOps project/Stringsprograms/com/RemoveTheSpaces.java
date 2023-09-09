package Stringsprograms.com;

public class RemoveTheSpaces {
    public static void main(String[] args) {
        String s="I am good and beautuful girl";
        String s1=" ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                s1=s1+s.charAt(i);
            }
        }
        System.out.println("After removing the spaces :"+s1);
    }
}
