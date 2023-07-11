//WAP to print the product of the digit from the give number
import java.util.Scanner;
class ProductOfGivenNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int product=1;
        while(num>0){
            int rem=num%10;
            product*=rem;
            num=num/10;
        }
        System.out.println(product);
    }
}