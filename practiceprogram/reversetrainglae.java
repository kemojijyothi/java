//reverse traingle
import java.util.Scanner;
class Passcal{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r=sc.nextInt();
        int space=0;
        int star=(r*2)-1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*"+"");
            }
            System.out.println();
            space++;
            star-=2;
        }

    }
}