// write a program to check the given number alphbet is upper case or lower case
import java.util.Scanner;
class UpperCaseOrLowerCase{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.println("lowercase");
        }
        else if(ch>='A'&&ch<='Z')
        {
            System.out.println("Uppercase");
        }
    }
}