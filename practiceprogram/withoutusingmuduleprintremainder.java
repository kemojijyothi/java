import java.util.Scanner;
class WithoutUsingMouduleOpePrintQuo{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for M:");
        int m=sc.nextInt();
        System.out.println("enter the value for N:");
        int n=sc.nextInt();
        int count=0;
        while(m>=n){
            m=m-n;
            count++;
        }
        System.out.println(count);

    }
}