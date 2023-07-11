//WAP to print the sum of digits from the given number
import java.util.Scanner;
class SumOfDigitIfNegitiveNum{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        int sum=0;
        if(num<0){
            num=num*-1;
        }
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num/=10;
        }
        System.out.println(sum);
    }
}