//WAP to print th eproduct of natural number number from 1 to n
import java.util.Scanner;
class ProductOfSum{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a value for n:");
        int n=scan.nextInt();
        int product=1;
        for(int i=1;i<=n;i++)
        {
            product=product*i;
        }
        System.out.println(product);
    }
}