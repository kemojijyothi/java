//write a program to print remainder without using divison and module operators
import java.util.Scanner;
class Remaider{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a value for m:");//m=10
        int m =scan.nextInt();
        System.out.println("enter a value for n:");//n=2

        int n=scan.nextInt();
        int count=0;
        while(m>=n)//10>=2 
        {
            m-=n;
            //m=10-2=>8  cou1: 
            //m=8-2=>6 cou2
            // m=6-2=>4  cou3
            //m=4-2=>2 cou4
            // m=2-2=>0 cout5 m=0;
            count++;
        }
        System.out.println(count);//0
    }
}