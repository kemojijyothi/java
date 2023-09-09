package section3;

public abstract class DIsplay1 {
    abstract void m1();
    public static void main(String[] args) {
        System.out.println("hello");

    }
}
class demo2 extends DIsplay1{

    @Override
    void m1() {
        System.out.println("hello guys");
    }

    public static void main(String[] args) {

    }
}
