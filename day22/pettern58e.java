import java.util.Scanner;
class pettern58e{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
   
        int space=r-1;
        int k=1;
         
        for(int i=1;i<=r;i++){
           char ch='a';
            for(int j=1;j<=space;j++)
            {
             System.out.print(" "+" ");
            }
            for(int m=1;m<=k;m++)
 		{
                  if(i%2==1)
                  System.out.print(m+" ");
                  else
		  System.out.print(ch+++" ");
		}
        System.out.println();
        space--;
        k=k+2;

    }
}
}