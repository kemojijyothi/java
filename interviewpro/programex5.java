import java.util.Scanner;
class programex4{
    public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number of rows:");
          int r=sc.nextInt();
          System.out.println("enter the number of cloumn:");
           int c=sc.nextInt();
          
          for(int i=1;i<=r;i++)
          {
            char ch='a';
            for(int j=1;j<=c;j++)
               {
                 if(i<=j){
                  System.out.print(ch+++" ");
                   }
                  else{
                   System.out.print(" "+" ");
                   }
               }
         System.out.println();

    }
}
}