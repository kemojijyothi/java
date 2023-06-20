//to print aM(a power of m) value a,m values take from the use  ex: 3 power of 4 
import java.util.Scanner;
class Powerofvalue{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Base value for a:");
        int a = sc.nextInt();
        System.out.println("enter the power of m");
        int m = sc.nextInt();
         int product=1;
        for(int i=1;i<=m;i++){
            product=product*a;

        }
        System.out.println(a+" power "+ m+" is "+product);

    }
}
