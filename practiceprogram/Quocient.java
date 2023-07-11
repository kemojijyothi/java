import java.util.Scanner;
class Quocient1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for M:");
        int m=sc.nextInt();
        System.out.println("enter the value for N:");
        int n=sc.nextInt();
        int quo=m/n;
        System.out.println("the quocient value is:"+quo);
    }
}