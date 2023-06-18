import java.util.Scanner;
class palidromeInNagitiveNum{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        int rev=0;
        int temp=num;
        while(num!=0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev)
        {
            System.out.println(" it is palidrome number:");
        }
    }
}