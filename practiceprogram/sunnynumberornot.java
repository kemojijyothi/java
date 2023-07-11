//WAP to print the given number is sunny number or not 
import java.util.Scanner;
class SunnyNumberOrNot{
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int count=0;
      for(int i=1;i<=n;i++){
        if(i*i==n+1){
            count++;
            break;
        }
        
      }
      if(count==1){
            System.out.println("sunny number:");
        }
        else{
            System.out.println("it not sunny number");
        }
    }
}