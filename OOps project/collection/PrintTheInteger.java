package collection;

import java.util.ArrayList;

public class PrintTheInteger {
    public static <instaceof> void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(80);
        a1.add(78.87);
        a1.add("vikram");
        a1.add('j');
        a1.add(89);
        a1.add("hello");
        for(int i=0;i<a1.size();i++){
            Object obj=a1.get(i);
            if(obj instanceof Integer)//The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
            {
                System.out.println(obj);
            }
        }
    }
}
