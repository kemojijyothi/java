import java.util.Scanner;
class TernaryOperator
{
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter value for a:");
        int a =scan.nextInt();
        System.out.println("enter value for b:");
        int b =scan.nextInt();
        System.out.println("enter value for c:");
        int c =scan.nextInt();
        System.out.println("enter value for d:");
        int d =scan.nextInt();
        String results=(a>b)&&(a>c)&&(a>d)?a+" is greater":b>c&&b>d?b+" is grater":c>d?c+" is grater":d+" is grater";
        System.out.println(results);
        
    }
}