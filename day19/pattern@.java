import java.util.Scanner;
class patterEx{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int n=sc.nextInt();
        System.out.println("enter the number of columns:");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1&&j==1||i==1&&j==r||i==r&&j==i||i==r&&j==c){
                    System.out.print("@"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
          System.out.println();
        }
    }
}