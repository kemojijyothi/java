//if the given number is spy number or not
import java.util.Scanner;
class Spaynumber{//spy number means sum pf didits and product os didts is eual it is spy number ex: 123 
    public static void main(String [] args)
     {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int num=scan.nextInt();
        int sum=0;
        int product=1;
        while(num>0)
        {
            int rem=num%10;
                sum=sum+rem;
                product=product*rem;
                num=num/10;

        }
        if(sum==product){
            System.out.println( "it is spay number");
        }
        else{
            System.out.println("it is not spy number");
        }
    
     }
}