import java.util.Scanner;
class program{
    public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number of rows:");
          int r=sc.nextInt();
          System.out.println("enter the number of cloumn:");
          int c=sc.nextInt();
          int k=1;
          for(int i=1;i<=r;i++)
          {
            for(int j=1;j<=c;j++)
            {
                if(i>j){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
          }

    }
}