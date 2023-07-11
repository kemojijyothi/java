//wap to find factors of given number
import java.util.Scanner;
class CountFactorsOfGivenNum{
    public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number:");
      int n=sc.nextInt();
      int count=0;
      for(int i=1;i<=n;i++){
             if(n%i==0){
                count++;
             }
      }
      System.out.println(count);
    }
}