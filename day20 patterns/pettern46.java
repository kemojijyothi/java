import java.util.Scanner;
class pettern46{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter th row:");
        int r=sc.nextInt();
        System.out.println("enter the cloumns");
        int c=sc.nextInt();
         char ch='A';
        for(int i=1;i<=r;i++){
            
            for(int j=1;j<=c;j++){
                if(j%2==1)
                    System.out.print(i+" ");
                else
                    System.out.print(ch+" ");               
            }
            System.out.println();
            ch++;
        }

        

    }
}