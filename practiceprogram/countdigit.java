//WAP to count number digits present in given number
import java.util.Scanner;
class CountTheDigitPresentIntTheNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println("digits present in the given number is :"+count);
    }
}