package section3;

public class Finalize {
    int a=10;

    public static void main(String[] args) {
        System.out.println(" prgraon starts");
        System.out.println(new Finalize().a);
        System.gc();
        System.out.println("profgram ends");

    }


}
