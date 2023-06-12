import java.util.Scanner;
class Division{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a valu for m:");
        int m=scan.nextInt();
        System.out.println("enter value for n:");
        int n =scan.nextInt();
        for(int i=m;i<=n;i++)
        {
            if(i%3==0&&i%4==0){
                System.out.println(i);
            }
        }
        
    }
}