import java.util.Scanner;
class pettern48{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter th row:");
        int r=sc.nextInt();
        System.out.println("enter the cloumns");
        int c=sc.nextInt();
         char position='A';
        for(int i=1;i<=r;i++){
            
            for(int j=1;j<=c;j++){
                
                    System.out.print(position+++" ");
                    
                                  
            }
            System.out.println();
            
        }

        

    }
}