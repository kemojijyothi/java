import java.util.Scanner;
class program6{
    public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number of rows:");
          int r=sc.nextInt();
          //System.out.println("enter the number of cloumn:");
           int space=r-1;
           int star=1;
           int n=1;
          
          for(int i=1;i<=r;i++)
          {
            for(int j=1;j<=space;j++)

            {
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++){
              System.out.print(n+++" ");
            }
            System.out.println();
            space--;
            star=star+2;
            
          }

    }
}