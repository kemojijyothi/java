//WAT program tothe number which is divisible by 3 and 4 between m to n
import java.util.Scanner;
class Divisible3and4betweenmton
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("enter the value of m");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            if(i%3==0 && i%4==0)
                System.out.println(i+" it is divisble by 3 and 4");
            else
            System.out.println(i+" is not divisible by 3 and 4");
        } 
    }
}