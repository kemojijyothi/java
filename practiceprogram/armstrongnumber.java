//WAP to print the number is amrstrong number or not
import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        int temp1=n;
        while(n>0){
             count++;
             n=n/10;
        }
       int sum=0;
      while(temp>0){
        int rem=temp%10;
        int product=1;
        for(int j=1;j<=count;j++){
            product=product*rem;
        }
        sum=sum+product;
        temp=temp/10;
       }
       if(sum==temp1){
        System.out.println("it is armstrong number");
       }
    }
}