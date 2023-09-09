class grandparent{
    int i=5;
    String s="bava";

}
class parent1 extends grandparent{
    int i=100;
    String s="kemoji jyothi";
    public void m1(){
        System.out.println(i);
        System.out.println(s);
        System.out.println(super.i);
        System.out.println(super.s);
    }
}
class child1 extends parent{
     int i=90;
     String s="bavikatui vikram kumar";
     public void m2(){
        System.out.println(i);
        System.out.println(s);
        System.out.println(super.i);
        System.out.println(super.s);

     }
}
class Mian{
    public static void main(String []args){
        child1 c=new child1();
        c.m2();
        parent1 p=new parent1();
        p.m1();
    }
}