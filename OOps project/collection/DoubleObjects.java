package collection;

import java.util.ArrayList;

public class DoubleObjects{
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add(80);
        a1.add(78.8877987887);
        a1.add("vikram");
        a1.add('j');
        a1.add(89.78653654);
        a1.add("hello");
        a1.add('i');
        a1.add('9');
        int count=0;
        for(int i=0;i<a1.size();i++){
            Object ob=a1.get(i);

            if(ob instanceof Character){
                count++;
            }
            else if (ob instanceof Double) {
                System.out.println(ob);
            }

        }
        System.out.println(count);
    }
}
