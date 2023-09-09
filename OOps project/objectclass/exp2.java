package objectclass;

public class exp2 {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException("divided by zero rule");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("main ends");
    }
}
