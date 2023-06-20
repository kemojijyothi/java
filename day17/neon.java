//Neon number : sum of the digit in square of the given number is equal to original number those number are called neon number
import java.util.Scanner;
class Neon{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int m=n*n;
        while(m>0){
                int rem=m%10;
                sum=sum+rem;
                m=m/10;
            }            
        
        if(sum==temp){
            System.out.println("neon number");
        }
        else{
            System.out.println("not a number");
        }
        
    }
}