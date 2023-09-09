package Stringsprograms.com;

import java.util.Scanner;

public class VowelConsonet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String ");
        String s=sc.next();
        int countvowel=0;
        int countconsonet=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                countvowel++;
            }
            else{
                countconsonet++;
            }
        }
        System.out.println("number vowel present int given string is:"+countvowel);
        System.out.println("number consonets present int given string is:"+countconsonet);

    }
}
