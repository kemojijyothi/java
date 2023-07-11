//WAP t print the sum of the digit 1)sum should not be greater than 26 2)again do the the sum
import java.util.Scanner;
class SumofGreaterThan26{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;   
            n=n/10;
        }
        if(sum>26){
           int a=sum;
           sum=0;
           while(a>0){
           int rem=a%10;
            sum=sum+rem;
            a/=10;
           }
        }
        System.out.println(sum);
    
    }
}