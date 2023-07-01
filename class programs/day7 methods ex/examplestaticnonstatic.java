class Test{
    int i=90;
    public void demo(){
        System.out.println("hello ");
        i=400;
        System.out.println(i);
    }
    public static void wish(){
    System.out.println(" hello every one");
    Test ts=new Test();
    System.out.println(ts.i);
    }

}
class TestEx{
    public  void run(){
        System.out.println("good morning");
       Test t=new Test();
       System.out.println(t.i);
        System.out.println("good evening");       
    }
    public static void main(String []args){
        System.out.println("main starts");
        Test t1=new Test();
        t1.demo();
        Test.wish();
        TestEx te=new TestEx();
        te.run();

    }

}