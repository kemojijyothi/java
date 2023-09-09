package section3;

public abstract class Display {
    abstract void m1();
    abstract void m2();
}
class sample1 extends Display{


    @Override
    void m1() {
        System.out.println("helo");
    }

    @Override
    void m2() {
        System.out.println("goodmorning");
    }
}
class Mainclass1{
    public static void main(String[] args) {
        sample1 s=new sample1();
        s.m1();
        s.m2();
        Display d=new sample1();
        d.m1();
        d.m2();

    }
}

