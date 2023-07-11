//WAP to print the m to n
import java.util.Scanner;
class EvenFormMtoN{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for M:");
        int m=sc.nextInt();
        System.out.println("enter the value for N:");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}