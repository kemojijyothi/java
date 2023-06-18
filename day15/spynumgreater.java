 /*  print the sum of didgits 
 sum should be not be grater than 26
 agin do the sum
 */
import java.util.Scanner;
class sumofdidgits{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        int sum=0;
        int position=0;
        while(num>0)
        {
            int rem=num%10;
             sum=sum+rem;
             num=num/10;

        }
        if(sum>26){
            int a=sum;
            sum=0;
            while(a>0)
            {
                int rem=a%10;
                sum=sum+rem;
                a=a/10;
            }
        }
        for(char ch='A';ch<='Z';ch++)
        {
            position++;
            if(position==sum)
            {
                System.out.println(ch+"=="+position);
            }
        }
        
        
    } 
}

