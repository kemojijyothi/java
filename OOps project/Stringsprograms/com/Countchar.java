package Stringsprograms.com;

import java.util.Scanner;

public class Countchar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String s=sc.next();
        int count=0;
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            s.charAt(i);
            count++;
        }
        System.out.println(count);
    }
}
