//perfect square
import java.util.Scanner;
class PerfectSquare{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(i*i==n){
                count++;
                
            }

        }
        if(count==1){
            System.out.println("it is perfect number");
        }
        else{
            System.out.println("it is not  a perefect numbet");
        }
    }
}