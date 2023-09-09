//super keyword
class parent{
    int i=100;
    String s="jyothi";

}
class child extends parent{
    int i=300;
    String s="kemoji";
    public void m1(){
        System.out.println(i);
        System.out.println(s);
        System.out.println(super.i);
    }
    public static void main(String []args){
        child c=new child();
        c.m1();
        
    }
}