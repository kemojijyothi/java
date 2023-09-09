package Stringsprograms.com;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        System.out.println("Before reversing a string ");
        String s=sc.next();

        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str=str+s.charAt(i);
        }
        System.out.println("After reversing a string "+str);
    }
}
