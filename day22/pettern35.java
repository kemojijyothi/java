import java.util.Scanner;
class pettern35{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of column:");
        int c=sc.nextInt();
        for(int i=r;i>=1;i--){
            for(int j=1;j<=c;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}