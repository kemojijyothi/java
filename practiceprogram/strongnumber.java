//WAP to print the strong number or not
import java.util.Scanner;
class StrongNumbePrintr{
    public static void mian(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number:");
       int n=sc.nextInt();
       int temp=n;
       int sum=0;
       while(n>0){
        int rem=n%10;
        int fact=1;
        for(int i=1;i<=rem;i++){
            fact=fact*i;
        }
        sum=sum+fact;
        n=n/10;
       } 
       if(sum==temp){
        System.out.println("it is strong number");
       }
    }
}