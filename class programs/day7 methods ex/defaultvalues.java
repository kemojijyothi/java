class Defaultvalues{
    static short s;
    static long l;
    double d;
    int i;
    float f;
    byte b;
    char ch;
    boolean bl;
    public static void main(String []args){
        System.out.println(s);
        System.out.println(l);
        Defaultvalues d=new Defaultvalues();
        System.out.println(d.d);
        System.out.println(d.i);
        System.out.println(d.f);
        System.out.println(d.b);
        System.out.println(d.ch);
        System.out.println(d.bl);
    }

}