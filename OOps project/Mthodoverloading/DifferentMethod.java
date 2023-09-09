package Mthodoverloading;

public class DifferentMethod {
    public  void show(){
        System.out.println(" non parameterixed method");
    }
    public String show(int i){
        System.out.println(" int type");
        return " jaava";
    }
    public char show(double d, String s){
        System.out.println(" double type & string type");
        return 'e';
    }

    public static void main(String[] args) {
        DifferentMethod d=new DifferentMethod();
        d.show();
        d.show(40);
        d.show(5.6," jyothi");
    }

}
