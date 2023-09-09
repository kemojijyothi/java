package collection;

import java.util.ArrayList;

public class EndsWithR {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Mamatha");
        a.add("kuamr");
        a.add("Vijaykumar");
        a.add("Sowmya");
        for(int i=0;i<a.size();i++){
            Object obj=a.get(i);//dowcasting
            if(obj instanceof String){
                String str=(String)obj;
                if(str.charAt(str.length()-1)=='r'){
                    System.out.println(obj);
                }
            }
        }
    }
}
