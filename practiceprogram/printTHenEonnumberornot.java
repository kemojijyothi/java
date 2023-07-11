//WAP to print the Neon NUmber
import java.util.Scanner;
class PrintTheNeonNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sqr=n*n;
        int sum=0;
        while(sqr>0){
            int rem=sqr%10;
            sum=sum+rem;
            sqr=sqr/10;
        }
        if(sum==n){
            System.out.println("it is Neon number");
        }
        else{
            System.out.println("it is not neon number");
        }
    }
}