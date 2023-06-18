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
        
        while(number>0)
        {
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;
           
        }
        if(temp==rev)
            System.out.println("it is aplidrome");
        else
        System.out.println("is not polindrome");
    }
}