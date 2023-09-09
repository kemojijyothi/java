package collection;

import java.util.ArrayList;

public class collectioninterfaceMethods {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(89);
        a.add(3.35);
        a.add("hello");
        a.add('j');
        a.add(true);
        System.out.println("The aaray list object a is:"+ a);
        ArrayList a1=new ArrayList();
        a1.add(80);
        a1.add(78.87);
        a1.add("vikram");
        a1.add('j');
        a1.add(89);
        a1.add("hello");
        System.out.println("The aaray list object a1 is:"+ a1);
        a.addAll(a1);
        System.out.println("after adding the elements from a1 in a"+ a);
        a.remove("hello");
        System.out.println("after removing the elemt hello from a:"+ a);
        System.out.println("does a conatis  j?"+a.contains('j'));//return the boolean
        System.out.println("does all the contains of a1 in a "+a.containsAll(a1));//return the boolean --->all the elements are present the inside a1
        a.retainAll(a1);
        System.out.println("retaing the a1 in a"+a);//a1 elemts along with matching elemts from a
        a.removeAll(a1);
        System.out.println("removing all emlemts from a1"+a);
        System.out.println("the sixe of a :"+ a.size());
        System.out.println("the sixe of a1 :"+ a1.size());
        System.out.println("does the a1 is empty "+a1.isEmpty());//return the boolean
        System.out.println(" to convert the arraylist to obj array");
        System.out.println(a1.iterator());
        Object[] obj=a1.toArray();
        for(int i=0;i<obj.length;i++){
            System.out.println(obj[i]);
        }
        a1.clear();
        System.out.println("after clearing the a1"+a1);

    }
}
