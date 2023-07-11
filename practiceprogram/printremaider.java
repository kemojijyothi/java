import java.util.Scanner;
class Remainder{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for M:");
        int m=sc.nextInt();
        System.out.println("enter the value for N:");
        int n=sc.nextInt();
        int remainder=m%n;
        System.out.println("the remainder value is:"+remainder);
    }
}