package Stringsprograms.com;

import java.util.Scanner;

public class Countspaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int countspaces=0;
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)==' ')
            {
                countspaces++;
            }
        }
        System.out.println("number spaces present in the given String is:"+countspaces);

    }
}
