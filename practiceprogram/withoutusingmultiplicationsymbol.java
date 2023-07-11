//WAP to the prefer multiplication till 10 for the given number without using multiplication symbol
import java.util.Scanner;
class Multiplictaion{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
           sum=sum+n;
           System.out.println(n+"*"+i+"="+sum);
        }
        
    }
}