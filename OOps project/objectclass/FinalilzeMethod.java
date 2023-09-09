package objectclass;

public class FinalilzeMethod {
    int a=10;

    public static void main(String[] args) {
        System.out.println("program stared");
        System.out.println(new FinalilzeMethod().a);
        System.gc();
        System.out.println("program ended");
    }

}
