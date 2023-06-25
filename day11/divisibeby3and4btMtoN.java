//WAP to print the number which is divisible by 3 and 4 between m and n
import java.util.Scanner;
class DivisibleBy3And4BtMtoN{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for m:");
        int m=sc.nextInt();
        System.out.println("enter the value for n:");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            if(i%3==0&&i%4==0){
                System.out.println(i+" it divisible by both");
            }
            System.out.println(i+" it is not divisible both");
        }


    }
}