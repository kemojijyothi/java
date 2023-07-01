import java.util.Scanner;
class pettern37{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of column:");
        int c=sc.nextInt();
        for(char i='A';i<=64+r;i++){
            for(int j=5;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}