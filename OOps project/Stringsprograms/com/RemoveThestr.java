package Stringsprograms.com;

import java.util.Scanner;

public class RemoveThestr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String ");
        String s=sc.nextLine();
        String op="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' '){
                op=op+s.charAt(i);
            }
        }
        System.out.println(op);
    }
}
