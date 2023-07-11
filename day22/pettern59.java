import java.util.Scanner;
class pettern59{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
   
        int space=r-1;
        int k=1;
        int num=1;
         char ch='a';
        for(int i=1;i<=r;i++){
           
            for(int j=1;j<=space;j++)
            {
             System.out.print(" "+" ");
            }
            for(int m=1;m<=k;m++)
 		{
                  if(m==1||m==k)
                  System.out.print(num+++" ");
                  else
		  System.out.print(ch+++" ");
		}
        System.out.println();
        space--;
        k=k+2;

    }
}
}