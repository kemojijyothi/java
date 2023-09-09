package collection;

import java.util.ArrayList;

public class LengthBetween3to5 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Susmithe");
        a.add("vikram");
        a.add("abhiram");
        a.add("jan");
        a.add("jhan");
        for(int i=0;i<a.size();i++){
            Object ob=a.get(i);
            if(ob instanceof String ){
                String str=(String)ob;
                if(str.length()>=3&&str.length()<=5){
                    System.out.println(str);
                }
            }
        }
    }
}
