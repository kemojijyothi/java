import java.util.Scanner;
class pettern64{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
   
        int space=(r-1)/2;
        int star=1;
        //int num=1;
        for(int i=1;i<=r;i++){
           char ch='a';
            for(int j=1;j<=space;j++)
            {
             System.out.print(" "+" ");
            }
            for(int m=1;m<=star;m++)
 		     {
                  
                  if(i==(r+1)/2){
                  System.out.print("*" +" ");
                  
                  }
                  else if(i<(r+1)/2)
                {
                    System.out.print(m+" ");
                    
                }
                else{
                    System.out.print(ch+++" ");
                }
		     }
        System.out.println();
        
        if(i<(r+1)/2)
        {
        space--;
        star=star+2;
        }
        else
          {
            star-=2;
            space++;
          }

    }
}
}