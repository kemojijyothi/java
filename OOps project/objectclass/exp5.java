package objectclass;

public class exp5 {
    public static void main(String[] args) {
        System.out.println("main starts");
        try{
            System.out.println("try strats");
            int []arr={1,2,3};
            System.out.println(arr[19]);
            System.out.println("try ends");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("catch is excuted");
            System.out.println(e.getMessage());
        }
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }
        System.out.println("main ends");
    }
}
