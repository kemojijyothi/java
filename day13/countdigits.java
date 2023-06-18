//write a program to count number didgits presents in a given number
import java.util.Scanner;
class CountTheDigit{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scan.nextInt();
        int temp=number;
        int count=0;
        while(number>0){
            count++;
            number/=10;

        }
        System.out.println(count);
    }
}