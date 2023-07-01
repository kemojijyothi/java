import java.util.Scanner;
class firstprogram{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter value of a:");
        int a=scan.nextInt();
        System.out.println(a);
        System.out.print("enter value of b:");
        float b=scan.nextFloat();
        System.out.println(b-a);
        System.out.print("enter value of c:");
        double c=scan.nextDouble();
        System.out.println(c+b);
        System.out.println(b++);
        System.out.println(++b-c++);
        System.out.println("enter the value d:");
        char d=scan.next().charAt(0);
        System.out.println(d);
        System.out.println("enter the value of e:");
        String e=scan.next();
        System.out.println(e);
        System.out.println("enter the value of f:");
        String f=scan.nextLine();
        System.out.println(f);
        
        
        


        

        
    }
}
