//WAP to print  sum of even number and product of odd number from m to n
import java.util.Scanner;
class CountoddnumAndEven{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for m:");
        int m=sc.nextInt();
        System.out.println("enter the value for n:");
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        int evencount=0;
        int oddcount=0;
        for(int i=m;i<=n;i++){
            if(i%2==0){
                evencount++;

            }
            else
            {
                oddcount++;
            }
            
            
        }
        System.out.println(evencount);
        System.out.println(oddcount);

    }
}