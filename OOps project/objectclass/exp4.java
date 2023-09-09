package objectclass;

public class exp4 {
    public static void main(String[] args) {
        System.out.println("main starts");
        m1();
        System.out.println("main ends");
    }
    public  static void m1(){
        System.out.println("m1 starts");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("m1 ends");

    }
    public static void m2(){
        System.out.println("m2 starts");
        m3();
        System.out.println("m2 ends");
    }
    public static void m3(){
        System.out.println("m3 starts");

        System.out.println("m3 ends");
    }
}
