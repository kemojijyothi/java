//write a program to print remainder without using divison and module operators
import java.util.Scanner;
class divisible{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a value for m:");//m=10
        int m =scan.nextInt();
        System.out.println("enter a value for n:");//n=2

        int n=scan.nextInt();
        while(m>=n)//10>=2 
        {
            m-=n;//m=10-2=>8 m=8-2=>6 m=6-2=>4 m=4-2=>2 m=2-2=>0 m=0;
        }
        System.out.println(m);//0
    }
}