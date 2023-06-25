//WAP to print  sum of even number and product of odd number from m to n
import java.util.Scanner;
class SumOfOddNumAndEvenNumFromMtoN{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for m:");
        int m=sc.nextInt();
        System.out.println("enter the value for n:");
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                sum=sum+i;

            }
            else
            {
                product=product*i;
            }
            

        }
        System.out.println("sum of even number from "+m+" to "+n+" is : "+sum);
        System.out.println("product of odd number from "+m+" to "+n+" is :"+product);

    }
}