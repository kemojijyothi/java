import java.util.Scanner;
class FabonacciSeries{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for(int i=1;i<count;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}