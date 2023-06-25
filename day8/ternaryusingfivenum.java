import java.util.Scanner;
class TernaryOperatorFiveDigits
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
        System.out.println("enter value for e:");
        int e =scan.nextInt();
        String results=(a>b)&&(a>c)&&(a>d)?a+" is greater":b>c&&b>d?b+" is grater":c>d&&c>e?c+" is greater":d>e?d+" is greter":e+" is greater";
        System.out.println(results);
        
    }
}