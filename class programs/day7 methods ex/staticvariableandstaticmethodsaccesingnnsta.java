class Nonstatic{
     static int i=40;
    public static void demo(){
        System.out.println(i);
    }
    public void run(){
        demo();
    }
    public static void main(String []args){
        demo();
        Nonstatic ns=new Nonstatic();
        ns.run();
    }
}