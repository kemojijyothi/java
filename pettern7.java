import java.util.Scanner;
class pettern7{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of column:");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1||j==1||i==r||j==c){
                    System.out.print("*"+" ");
                }
                else if(i==j||i+j==r+1){
                    System.out.print("#"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        
    }
}