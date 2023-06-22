import java.util.Scanner;
class Method{
    public static int add(int i,int j){
    return i+j;
    }
    public static int sub(int i,int j){
        return i-j;
    }
    public static int mul(int i,int j){
        return i*j;
    }
    public static int division(int i,int j){
        return i/j;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for i :");
        int i =sc.nextInt();
        System.out.println("enter the value for j :");
        int j =sc.nextInt();
        System.out.println("addition of two number is:"+add(i,j));
        System.out.println("addition of two number is:"+sub(i,j));
        System.out.println("addition of two number is:"+mul(i,j));
        System.out.println("addition of two number is:"+division(i,j));
    }
}