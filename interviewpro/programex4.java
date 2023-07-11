import java.util.Scanner;
class programex4{
    public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number of rows:");
          int r=sc.nextInt();
          //System.out.println("enter the number of cloumn:");
           int space=(r-1)/2;
           int star=1;
          
          for(int i=1;i<=r;i++)
          {
            for(int j=1;j<=space;j++)

            {
                System.out.print(" "+" ");
            }
            for(int k=1;k<=star;k++){
              System.out.print("*"+" ");
            }
            System.out.println();
            if(i<(r+1)/2)
            {
              space--;
              star=star+2;
            }
            else{
            space--;
            star=star-2;
            
          }

    }
}
}