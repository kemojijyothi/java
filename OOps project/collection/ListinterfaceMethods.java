package collection;

import java.util.ArrayList;

public class ListinterfaceMethods {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(78);
        a.add(7.9);
        a.add("vicky");
        a.add('g');
        a.add(true);
        System.out.println("the arraylist a is:"+a);
        ArrayList a1=new ArrayList();
        a1.add(56);
        a1.add(9.9);
        a1.add("vickybai");
        a1.add('k');
        a1.add(78);
        System.out.println("the arraylist a1 is :"+a1);
        a.add(1,"Manohari");
        System.out.println("after adding the content on 1 st :"+a);
        a.addAll(1,a1);
        System.out.println("after the adding a1 to a at the list of array :"+a);
        System.out.println("the index of an a is :"+a.indexOf('k'));
        System.out.println("get the index of elemt  "+a1.get(4));
        a.set(6,"manisha");
        System.out.println(a);

    }
}
