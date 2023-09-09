package collection;

import java.util.ArrayList;

public class StringStartingS {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Mamatha");
        a.add("Susmitha");
        a.add("Vijay");
        a.add("Sowmya");
        for(int i=0;i<a.size();i++){
            Object obj=a.get(i);//dowcasting
            if(obj instanceof String){
                String str=(String)obj;
                if(str.charAt(0)=='S'){
                    System.out.println(obj);
                }
            }
        }
    }
}
