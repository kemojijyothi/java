//WAP to print sum of even number and product of odd number from m to n
import java.util.Scanner;
class CountSumOfEvenNumberProductOddNum{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for M:");
        int m=sc.nextInt();
        System.out.println("enter the value for N:");
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        int counteven=0;
        int countodd=0;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                counteven++;
            }
            else{
                countodd++;
            }
        }
        System.out.println("count the even number"+counteven);
        System.out.println("count the odd number"+countodd);
    }
}