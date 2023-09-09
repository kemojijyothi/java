package Stringsprograms.com;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String s=sc.next();
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str=str+s.charAt(i);
        }
        if(s.equals(str)){
            System.out.println("given string is palidrome ");
        }
        else{
            System.out.println("given string is not palidrome string");
        }
    }
}
