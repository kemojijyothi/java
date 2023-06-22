import java.util.Scanner;
class ExampleMethod{
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
        System.out.println(press 1:"Add"\npress 2:"Sub"\npress 3:"mul"\npress 4:"division");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a choice");
        int choice=sc.nextInt();
        System.out.println("enter the value for i :");
        int i =sc.nextInt();
        System.out.println("enter the value for j :");
        int j =sc.nextInt();
        switch(choice){
            case 1:System.out.println(" addtion of two number"+add(i,j));
            break;
            case 2:System.out.println(" multipecation  of two number"+mul(i,j));
            break;
            case 3:System.out.println(" divison of two number"+division(i,j));
            break;
            case 4:System.out.println(" sub  of two number"+sub(i,j));
            break;
            

        }
        
    }
}