import java.util.Scanner;
class IFCondition
{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter value of a:");
        int a=scan.nextInt();
        System.out.print("enter value of b:");
        int b=scan.nextInt();
        System.out.println("value of a is:"+a);
        System.out.println("value of b is :"+b);
        if(a<b)//check the condition if condition true executed the statement other wise come out of the if statement
        {
            System.out.println("hello goodmorning ");
        }
        
    
    }
}