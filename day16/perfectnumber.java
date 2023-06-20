//perfect number: if the factor of the sun is equal to the given number those number are called the perfect number ex:6 
import java.util.Scanner;
class perfectjy{
    public static void main(String [] args){
        int sum=0;
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("it is perfect number:");
        }
        else{
            System.out.println("it is not perfect number:");
        }
    }
}