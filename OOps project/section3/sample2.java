package section3;
// single level inheritance by using interface
public interface sample2 {
    int i=10;
    void m1();
    void m2();
}
class demo implements sample2{

    @Override
    public void m1() {
        System.out.println("hello m1 is in chiled class");
    }

    @Override
    public void m2() {
        System.out.println("m2 is in arnet class");
    }
}
class mainsample2{
    public static void main(String[] args) {
        demo d=new demo();
        d.m1();;
        d.m2();
    }
}
