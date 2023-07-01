class Staticmethod1{
    double d=3.0;
    public void m1(int i){
        System.out.println("m1 starts ");
        System.out.println(i);
    }
    public static boolean m2(char ch,String s){
        System.out.println("m2 starts");
        System.out.println(ch+" "+s);
        Staticmethod1 m=new Staticmethod1();
        System.out.println(m.d);
        m.m1(500);
        return true;
        
    }
    public static void main(String []args){
        System.out.println(m2('j',"chitti"));

    }
}