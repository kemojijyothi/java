//count the even number from m to n
import java.util.Scanner;
class EvenNumCount{
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value for m:");
      int m=sc.nextInt();
      System.out.println("enter the value for n:");
      int n=sc.nextInt();
      int count=0;
      for(int i=m;i<=n;i++){
        if(i%2==0){
            count++;
        }
        
      }  
      System.out.println(count);
    }

}