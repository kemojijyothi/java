import java.util.Scanner;
class pettern47{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter th row:");
        int r=sc.nextInt();
        System.out.println("enter the cloumns");
        int c=sc.nextInt();
         int k=1;
        for(int i=1;i<=r;i++){
            
            for(int j=1;j<=c;j++){
                
                    System.out.print(k+" ");
                    k++;
                                  
            }
            System.out.println();
            
        }

        

    }
}