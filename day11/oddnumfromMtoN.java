//write print even number from from mto n
import java.util.Scanner;
class OddnumMtoN{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for m:");
        int m=sc.nextInt();
        System.out.println("enter the value for n:");
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            if(i%2!=0){
                System.out.println(i+" it is even number:");
            }
        }
    }
}   
            