import java.util.Scanner;
class TernaryTwoNumb{
public static void main(String []args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the value for A:");
 int a=sc.nextInt();
 System.out.println("enter th evalue for B:");
 int b= sc.nextInt();
 String c=a>b?"is greater":"it is smaller";
 System.out.println(c);
}
}