package Programming;

import java.util.Scanner;

public class stringpalidrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String name:");
        String s=sc.nextLine();
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str=str+s.charAt(i);
        }
        if(str.equals(s)){
            System.out.println(s+" palidrome");
        }
        else{
            System.out.println(s+" not palidrome");
        }
    }
}
