import java.util.Scanner;
class pettern61{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
   
        int space=r-1;
        int k=1;
        int num=1;
         
        for(int i=1;i<=r;i++){
           
            for(int j=1;j<=space;j++)
            {
             System.out.print(" "+" ");
            }
            for(int m=1;m<=k;m++)
 		    {
                System.out.print(num+++" ");
                if(num>=2){
                    num=0;
                }
                  
		    }
        System.out.println();
        space--;
        k=k+2;

    }
}
}