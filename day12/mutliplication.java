//WAP the perform mutliplication till 10 for the given number
import java.util.Scanner;
class Multiplication{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));

        }
    }
}