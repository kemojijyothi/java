//write a program to reverse a given number 
import java.util.Scanner;
class ReverseTheNumber{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=scan.nextInt();
        int rev=0;
        int temp=number;
        System.out.println("before reverse a number:"+number);
        while(number>0)
        {
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;
           
        }
        System.out.println("afetr a reverse the number:"+rev)
        
    }
}