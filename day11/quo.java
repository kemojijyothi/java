//write print the remaider value 
import java.util.Scanner;
class quoMIsDivisibleN{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value for m:");
        int m=sc.nextInt();
        System.out.println("enter the value for n:");
        int n=sc.nextInt();
        int quo=n/m;
        System.out.println(quo);
    }
}