//WAP to print multiplication without using multiplication symbal
import java.util.Scanner;
class MultiplicationTableWithoutUsingMS{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+n;
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}