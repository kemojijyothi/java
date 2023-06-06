
import java.util.Scanner;
class swapNumber2//with out using the third variable
{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value for num1:");
        int num1=scan.nextInt();
        System.out.println("enter the value for num2:");
        int num2=scan.nextInt();
        
        System.out.println("before swaping the num1 and num2 values are:"+num1+" "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("before swaping the num1 and num2 values are:"+num1+" "+num2);
        
        
    }
}