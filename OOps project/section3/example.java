package section3;

public class example {
    example() {
        System.out.println("hello");
    }

    example(int i) {
        System.out.println("hello helloooo");
    }
}
class main{
    public static void main(String[] args) {
        example e= new example();
        example e1=new example(89);

    }


}