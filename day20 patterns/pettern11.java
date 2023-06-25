import java.util.Scanner;
class petterne11{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of column:");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==(r+1)/2&&j==(c+1)/2||i<=(r+1)/2&&j==1||i==1&&i>=(c+1)/2||i==r&&j<=(c+1)/2||j==c&&j==(r+1)/2){
                    System.out.print("*"+" ");
                }
                
                
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        
    }
}