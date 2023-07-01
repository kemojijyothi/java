//WAP to check the given number is even or odd
import java.util.Scanner;
class EvenOrOdd{
    public static void EvenOrOdd(int n){
        if(n%2==0){
            System.out.println(n+" it is even number");
        }
        else{
            System.out.println(n+"it is odd number");
        }
    
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number:");
        int n=sc.nextInt();
        EvenOrOdd(n);
        

    }
}