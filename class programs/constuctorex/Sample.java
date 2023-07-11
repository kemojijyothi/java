//import java.util.Scanner;
class Sample{
    int i=100;
    Sample(){
        System.out.println("non parameterized constaructor");
    }
    public static void main(String []args){
        System.out.println("main starts");
        Sample s1=new Sample();
        System.out.println(s1.i);
        Sample s2=new Sample();
        System.out.println(s2.i);
        System.out.println("main ends");
    }
}