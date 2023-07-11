//import java.util.Scanner;
class Sample1{
    int i=100;
    Sample1(String s,int n){
        System.out.println("non parameterized constaructor");
        System.out.println(s);
        System.out.println(i);
        System.out.println(n);
    }
    public static void main(String []args){
        System.out.println("main starts");
        Sample1 s1=new Sample1("java",9);
        System.out.println(s1.i);
        Sample1 s2=new Sample1("apple",6);
        System.out.println(s2.i);
        System.out.println("main ends");
    }
}