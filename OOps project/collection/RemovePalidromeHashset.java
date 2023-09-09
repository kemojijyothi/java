package collection;

import java.util.HashSet;
import java.util.Iterator;

public class RemovePalidromeHashset {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("malayalam");
        h.add("mom");
        h.add("jyoyhi");
        System.out.println("the hashset objects are:"+h);
        Iterator itr=h.iterator();
        while(itr.hasNext()){
            String str=(String)itr.next();
            String s="";
            for(int i=str.length()-1;i>=0;i--){
                s=s+str.charAt(i);
            }
            if(!(s.equals(str))){
                itr.remove();
            }

        }
        System.out.println(h);

    }
}
