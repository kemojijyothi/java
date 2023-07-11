//WAP to check the product od=f digit and sum of didgit of the given number is equal or not
//wap to print the given number is spy number
import java.util.Scanner;
class ProductOfTheNumAndSumOfNumOrAreEualOrNot{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
   
    int num=sc.nextInt();
    int sum=0;
    int product=1;
    while(num>0){
        int rem=num%10;
        sum+=rem;
        product*=rem;
        num=num/10;
    }
    if(sum==product){
        System.out.println("some of number and product of number are equal");
    }
    else {
        System.out.println("some number and product of number are not equal");
    }
   }
}
    