import java.util.Scanner;
class fibonnaci{
    public static void main(String[] args){
        int a=0;
        int b=0;
        int c=1;
        int d;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(a);
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}