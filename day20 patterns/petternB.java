//WAP to print A alphabet
import java.util.Scanner;
class PetterB
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("enter the number of columns:");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++)
        
        if((j==i||i==1)&&j!=c||i==(r+1)/2||(i==r&&j!=c)||j==c&&i!=1&&i!=r&&i!=(r+1)/2){
            System.out.print("*"+" ");
        }
        else 
        {
            System.out.print(" "+" ");
        }
        System.out.println();
    }
    
    }
}