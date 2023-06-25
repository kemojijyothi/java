import java.util.Scanner;
class PositiveOrNegitive{
public static void main(String []args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int num=sc.nextInt();
  if(num>0)
   {
    System.out.println(num+" it is positive number");
    }
 else if(num<0)
  {
   System.out.println(num+" it is negitivr num");
  }
 else{
     System.out.println("invalid ");
  }
} 
}     