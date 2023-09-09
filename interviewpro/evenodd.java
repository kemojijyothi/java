import java.util.Scanner;
class Evenodd{
    public static void evenodd(int n){
        if(n%2==0){
            System.out.println("its ia even number");
        }
        else{
            System.out.println("its is odd number");
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("main methods");
        evenodd(n);
    }
}