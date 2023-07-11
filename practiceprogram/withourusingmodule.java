import java.util.Scanner;
class Quocient{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for M:");
        int m=sc.nextInt();
        System.out.println("enter the value for N:");
        int n=sc.nextInt();
        while(m>=n){
            m=m-n;
        }
        System.out.println(m);

    }
}