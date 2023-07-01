import java.util.Scanner;
class swapNumber{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter value for a:");
        int a=scan.nextInt();
        System.out.println("enter value for b:");
        int b=scan.nextInt();
        int temp;
        System.out.println("before swaping the a and b values are:"+a+" "+b);
         temp=a;
         a=b;
         b=temp;
         System.out.println("after swaping the a and b values are:"+a+" "+b);
    }
}