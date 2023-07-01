import java.util.Scanner;
class pettern56{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter th row:");
        int r=sc.nextInt();
        System.out.println("enter the cloumns");
        int c=sc.nextInt();
          int k=0;
        for(int i=1;i<=r;i++){
             k=k+i;
            int n=k;
            for(int j=1;j<=c;j++){
             if(i>=j)
            System.out.print(n--+" "); 
            
          
                
            }
            System.out.println();
        }

        


    }
}