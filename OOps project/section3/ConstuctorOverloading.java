package section3;

public class ConstuctorOverloading {
    int i;
    static double d;
    public void m2(int i,double d){
        this.i=i;
        this.d=d;
    }

    public static void main(String[] args) {
        ConstuctorOverloading ref=new ConstuctorOverloading();
        ref.m2(3,4.6);
        System.out.println(ref.i+" "+d);
    }

}
