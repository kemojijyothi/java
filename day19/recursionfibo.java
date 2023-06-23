//write a program to print the fibonnie series by using recursion
import java.util.Scanner;
class fibonocieSeries{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count=1;
        fibo(a,b,n,count);
    }
    public static void fibo(int a,int b,int n,int count){
        {
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
            if(count<=n){
                fibo(a,b,n,count);
            }
        }

    }
}
