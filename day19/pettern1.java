import java.util.Scanner;
class pattern1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of cloums:");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}