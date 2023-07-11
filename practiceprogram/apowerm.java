//  wap to print a power m value
import java.util.Scanner;
class ApowerMvalue{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for a :");
        int a=sc.nextInt();
        System.out.println("enter the value for m:");
        int m=sc.nextInt();
        int product=1;
        for(int i=1;i<=m;i++){
            product=product*a;
        }
        System.out.println(product);
    }
}