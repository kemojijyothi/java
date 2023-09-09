package section3;

import org.w3c.dom.ls.LSOutput;

public class sample {
    sample(){
        System.out.println("hello good morning");
    }
    sample(int i){
        System.out.println("with int type constuctor");
    }
    sample(String s){
        System.out.println(" string type  of data");
    }

    public static void main(String[] args) {
        sample s=new sample();
        sample s1=new sample(80);
        sample s2=new sample("jyothi");

    }



}
